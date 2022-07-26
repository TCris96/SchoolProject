package com.school.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;

    @OneToMany(mappedBy = "subject")
    private List<Grade> grades;

    @OneToMany(mappedBy = "subject")
    private Set<Teacher> teachers;


}
