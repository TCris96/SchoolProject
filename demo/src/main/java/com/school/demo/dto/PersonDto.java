package com.school.demo.dto;

import com.school.demo.entity.Address;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class PersonDto {

    private String firstName;
    private String lastName;
    private int age;
    private AddressDto address;
}
