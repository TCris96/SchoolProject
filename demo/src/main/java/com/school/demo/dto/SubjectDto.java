package com.school.demo.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class SubjectDto {

    private String name;
    private List<GradeDto> grades;
    private Set<TeacherDto> teachers;
}
