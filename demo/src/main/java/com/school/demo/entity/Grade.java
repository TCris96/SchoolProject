package com.school.demo.entity;

import com.school.demo.entity.subjectenum.Subject;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
public class Grade {
    @Id
    @GeneratedValue
    private int id;
    private int value;
    private Subject subject;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    public Grade(int value, Subject subject, LocalDate date, Student student) {
        this.value = value;
        this.subject = subject;
        this.date = date;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", value=" + value +
                ", subject=" + subject +
                ", date=" + date +
                '}';
    }
}
