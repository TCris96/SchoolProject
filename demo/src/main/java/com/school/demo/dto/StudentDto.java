package com.school.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto{

    private Long id;
    private PersonDto personDto;
    private Long personId;
    private long addressId;
    private String cnp;
    private long classroomId;


}
