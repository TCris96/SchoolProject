package com.school.demo.service;

import com.school.demo.dto.PersonWithFullNameDto;
import com.school.demo.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonWithFullNameMapper implements Mapper<Person, PersonWithFullNameDto> {

    @Override
    public PersonWithFullNameDto convertToDto(Person person) {
        PersonWithFullNameDto result = new PersonWithFullNameDto();
        result.setId(person.getId());
        result.setFirstName(person.getFirstName());
        result.setLastName(person.getLastName());

        return result;
    }

    @Override
    public Person convertToEntity(PersonWithFullNameDto personWithFullNameDto) {
        Person result = new Person();
        result.setId(personWithFullNameDto.getId());
        result.setFirstName(personWithFullNameDto.getFirstName());
        result.setLastName(personWithFullNameDto.getLastName());

        return result;
    }
}
