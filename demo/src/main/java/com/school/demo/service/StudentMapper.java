package com.school.demo.service;

import com.school.demo.dto.StudentDto;
import com.school.demo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper implements Mapper<Student, StudentDto> {
    @Override
    public StudentDto convertToDto(Student entity) {
        StudentDto result = new StudentDto();
        result.setId(entity.getId());
        result.setGrades(entity.getGrades());
        result.setClassroom(entity.getClassroom());
        result.setCnp(entity.getCnp());
        return result;
    }

    @Override
    public Student convertToEntity(StudentDto dto) {
        Student result = new Student();
        result.setId(dto.getId());
        result.setGrades(dto.getGrades());
        result.setClassroom(dto.getClassroom());
        result.setCnp(dto.getCnp());
        return result;
    }
}
