package com.school.demo.dto;

import com.school.demo.entity.Classroom;
import com.school.demo.entity.Grade;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto{

    private Long id;
    private String cnp;
    private List<GradeDto> grades;
    private ClassroomDto classroom;
    private PersonDto person;

}
