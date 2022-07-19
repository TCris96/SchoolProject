package com.school.demo.entity;

import com.school.demo.entity.subjectenum.Subject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Classroom {
    @Id
    @GeneratedValue
    private int id;
    private Subject subject;
    @OneToMany(mappedBy = "classroom")
    private List<Student> students;
    @OneToOne(mappedBy = "classroom")
    private Teacher teacher;

    public Classroom(Subject subject, Teacher teacher) {
        this.subject = subject;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", subject=" + subject +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
