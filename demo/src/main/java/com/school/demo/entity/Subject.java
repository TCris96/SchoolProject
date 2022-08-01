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

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    private List<Grade> grades;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    private Set<Teacher> teachers;


}
