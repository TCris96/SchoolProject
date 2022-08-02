package com.school.demo.service;

import com.school.demo.dto.StudentDto;
import com.school.demo.entity.Person;
import com.school.demo.entity.Student;
import com.school.demo.repository.PersonRepository;
import com.school.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StudentMapper implements Mapper<Student, StudentDto> {
    PersonMapper personMapper;
    StudentRepository studentRepository;
    PersonRepository personRepository;
    @Override
    public StudentDto convertToDto(Student student) {
        StudentDto result = new StudentDto();
        result.setId(student.getId());
        result.setCnp(student.getCnp());
        if (student.getPerson() !=null){
            result.setPersonDto(personMapper.convertToDto(student.getPerson()));
            result.setPersonId(student.getPerson().getId());
        }

        result.setAddressId(student.getPerson().getAddress().getId());
        result.setClassroomId(student.getClassroom().getId());

        return result;
    }

    @Override
    public Student convertToEntity(StudentDto studentDto) {
        Student result = new Student();
        result.setId(studentDto.getId());
        result.setCnp(studentDto.getCnp());
        if (studentDto.getPersonId() !=null){
            Person person= personRepository.findById(studentDto.getPersonId()).orElse(new Person());
            result.setPerson(person);
            result.getPerson().setId(studentDto.getAddressId());
        }
        result.getClassroom().setId(studentDto.getClassroomId());

        return result;
    }
}
