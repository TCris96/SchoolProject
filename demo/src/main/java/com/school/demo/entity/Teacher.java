package com.school.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Teacher extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;


}
