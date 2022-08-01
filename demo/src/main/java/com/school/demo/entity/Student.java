package com.school.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnp;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Grade> grades;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Person person;

}
