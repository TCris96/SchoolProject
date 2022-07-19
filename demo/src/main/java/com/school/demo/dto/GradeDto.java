package com.school.demo.dto;

import com.school.demo.entity.Student;
import com.school.demo.entity.subjectenum.Subject;
import lombok.Data;

import java.time.LocalDate;
@Data
public class GradeDto {
    private Long id;
    private int value;
    private Subject subject;
    private LocalDate date;
    private Student student;
}
