package com.school.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
public class Person {

    private String firstName;
    private String lastName;
    private int age;


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;


}
