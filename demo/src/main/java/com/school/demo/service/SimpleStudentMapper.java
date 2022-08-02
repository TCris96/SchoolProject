package com.school.demo.service;

import com.school.demo.dto.PersonWithFullNameDto;
import com.school.demo.dto.SimpleStudentDto;
import com.school.demo.entity.Person;
import com.school.demo.entity.Student;
import com.school.demo.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SimpleStudentMapper implements Mapper<Student, SimpleStudentDto> {

    private PersonWithFullNameMapper personWithFullNameMapper;
    private PersonRepository personRepository;

    @Override
    public SimpleStudentDto convertToDto(Student student) {
        SimpleStudentDto result = new SimpleStudentDto();

        result.setId(student.getId());
        if (student.getPerson() != null){
            PersonWithFullNameDto person = personWithFullNameMapper.convertToDto(student.getPerson());
            result.setPerson(person);
            result.setPersonId(person.getId());
        }
        return result;
    }

    @Override
    public Student convertToEntity(SimpleStudentDto simpleStudentDto) {
        Student result = new Student();
        result.setId(simpleStudentDto.getId());
        if(simpleStudentDto.getPersonId() != null){
            Person person = personRepository.findById(simpleStudentDto.getPersonId()).orElseThrow();
            result.setPerson(person);
        }
        return result;
    }
}
