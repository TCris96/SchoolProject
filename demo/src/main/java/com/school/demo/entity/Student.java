package com.school.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id",nullable = false,updatable = false)
    private Long id;

    private String cnp;

    @OneToMany(mappedBy = "student")
    private List<Grade> grades;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @OneToOne
    @JoinColumn
    private Person person;

}
