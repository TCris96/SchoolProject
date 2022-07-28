package com.school.demo.service;

import com.school.demo.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonMapper personMapper;
    private PersonRepository personRepository;
}
