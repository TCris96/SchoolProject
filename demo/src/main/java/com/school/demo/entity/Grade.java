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

    private int value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")

    private Subject subject;

    private LocalDate date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student student;

}
