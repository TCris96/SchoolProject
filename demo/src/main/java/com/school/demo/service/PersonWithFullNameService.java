package com.school.demo.service;

import com.school.demo.dto.PersonWithFullNameDto;
import com.school.demo.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PersonWithFullNameService {

    private PersonRepository personRepository;
    private PersonWithFullNameMapper personWithFullNameMapper;

    public List<PersonWithFullNameDto> getAllPersons(){
        return personRepository.findAll()
                .stream()
                .map(person->personWithFullNameMapper.convertToDto(person))
                .collect(Collectors.toList());
    }
}
