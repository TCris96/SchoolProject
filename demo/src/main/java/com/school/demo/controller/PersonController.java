package com.school.demo.controller;

import com.school.demo.dto.StudentDto;
import com.school.demo.service.PersonService;
import com.school.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/students")
public class PersonController {

    @Autowired
    private PersonService personService;


}
