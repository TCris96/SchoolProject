package com.school.demo.service;

import com.school.demo.dto.StudentDto;
import com.school.demo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper implements Mapper<Student, StudentDto> {
    @Override
    public StudentDto convertToDto(Student student) {
        StudentDto result = new StudentDto();
        result.setId(student.getId());
        result.setCnp(student.getCnp());
//        result.setClassroom(student.getClassroom());
//        result.setGrades(student.getGrades());
//        result.setAddress(student.getAddress());
//        result.setAge(student.getAge());
//        result.setFirstName(student.getFirstName());
//        result.setLastName(student.getLastName());

        return result;
    }

    @Override
    public Student convertToEntity(StudentDto studentDto) {
        Student result = new Student();
        result.setId(studentDto.getId());
        result.setCnp(studentDto.getCnp());
//        result.setClassroom(studentDto.getClassroom());
//        result.setGrades(studentDto.getGrades());
//        result.setAddress(studentDto.getAddress());
//        result.setAge(studentDto.getAge());
//        result.setFirstName(studentDto.getFirstName());
//        result.setLastName(studentDto.getLastName());

        return result;
    }
}
