package com.school.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Person {

    @OneToMany(mappedBy = "student")
    private List<Grade> grades;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" +
                "} " + super.toString();
    }
}
