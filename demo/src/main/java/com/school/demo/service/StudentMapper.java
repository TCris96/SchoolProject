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
        result.setLastName(student.getPerson().getLastName());
        result.setFirstName(student.getPerson().getFirstName());
        result.setAge(student.getPerson().getAge());
        result.setAddressId(student.getPerson().getAddress().getId());
        result.setClassroomId(student.getClassroom().getId());

        return result;
    }

    @Override
    public Student convertToEntity(StudentDto studentDto) {
        Student result = new Student();
        result.setId(studentDto.getId());
        result.setCnp(studentDto.getCnp());
        result.getPerson().setLastName(studentDto.getLastName());
        result.getPerson().setFirstName(studentDto.getFirstName());
        result.getPerson().setAge(studentDto.getAge());
        result.getPerson().setId(studentDto.getAddressId());
        result.getClassroom().setId(studentDto.getClassroomId());

        return result;
    }
}
