package com.school.demo.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
    private List<Student> students;




}
