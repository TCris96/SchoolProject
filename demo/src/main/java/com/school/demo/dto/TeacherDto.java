package com.school.demo.dto;

import com.school.demo.entity.Classroom;
import lombok.Data;

@Data
public class TeacherDto {

    private Long id;

    private ClassroomDto classroom;
    private PersonDto person;
}
