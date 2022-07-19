package com.school.demo.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Long id;
    private String city;
    private String streetName;
    private int streetNo;
    private String building;
}
