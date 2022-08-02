package com.school.demo.controller;

import com.school.demo.dto.PersonDto;
import com.school.demo.dto.SimpleStudentDto;
import com.school.demo.dto.StudentDto;
import com.school.demo.service.SimpleStudentService;
import com.school.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private SimpleStudentService simpleStudentService;

    @GetMapping
    public List<StudentDto> displayStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto findStudent(@PathVariable( "id") long id){
       return studentService.findById(id);
    }

    @GetMapping("/simple-students")
    public List<SimpleStudentDto> getAllStudents(){
        return simpleStudentService.getAllStudents();
    }
}
