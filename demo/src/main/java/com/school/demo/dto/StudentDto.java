package com.school.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto{

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private long addressId;
    private String cnp;
    private long classroomId;


}
