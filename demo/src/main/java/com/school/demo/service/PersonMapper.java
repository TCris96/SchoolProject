package com.school.demo.service;

import com.school.demo.dto.PersonDto;
import com.school.demo.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper implements Mapper<Person, PersonDto> {
    @Override
    public PersonDto convertToDto(Person person) {
        PersonDto result = new PersonDto();
//        result.setAddress(person.getAddress());
        result.setAge(person.getAge());
        result.setFirstName(person.getFirstName());
        result.setLastName(person.getLastName());

        return result;
    }

    @Override
    public Person convertToEntity(PersonDto personDto) {
        Person result = new Person();
//        result.setAddress(personDto.getAddress());
        result.setAge(personDto.getAge());
        result.setFirstName(personDto.getFirstName());
        result.setLastName(personDto.getLastName());

        return result;
    }
}
