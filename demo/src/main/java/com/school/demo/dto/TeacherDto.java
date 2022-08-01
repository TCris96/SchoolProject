package com.school.demo.dto;

import lombok.Data;

@Data
public class TeacherDto {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private long addressId;
    private long classroomId;
}
