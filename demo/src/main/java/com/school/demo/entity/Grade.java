package com.school.demo.entity;

import com.school.demo.entity.subjectenum.Subject;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private Subject subject;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

}
