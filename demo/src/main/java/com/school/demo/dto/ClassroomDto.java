package com.school.demo.dto;

import com.school.demo.entity.Student;
import com.school.demo.entity.Teacher;
import lombok.Data;

import java.util.List;

@Data
public class ClassroomDto {

    private Long id;
    private List<Student> students;
    private Teacher teacher;
}
