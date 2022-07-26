package com.school.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private int value;

    @ManyToOne
    @JoinColumn(name = "subject_id",insertable = false, updatable = false)

    private Subject subject;

    private LocalDate date;
    @ManyToOne
    @JoinColumn(name="student_id",insertable = false, updatable = false)
    private Student student;

}
