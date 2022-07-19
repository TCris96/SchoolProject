package com.school.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String city;
    private String streetName;
    private int streetNo;
    private String building;
    @OneToOne(mappedBy = "address")
    private Person person;

    public Address(String city, String streetName, int streetNo, String building) {
        this.city = city;
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNr=" + streetNo +
                ", building='" + building + '\'' +
                '}';
    }
}
