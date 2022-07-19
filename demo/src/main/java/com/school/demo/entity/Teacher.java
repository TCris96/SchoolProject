package com.school.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Teacher extends Person {

    @OneToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    public Teacher(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" +
                ", classroom=" + classroom +
                "} " + super.toString();
    }
}
