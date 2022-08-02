package com.school.demo.service;

import com.school.demo.dto.SimpleStudentDto;
import com.school.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SimpleStudentService {

    private SimpleStudentMapper studentMapper;
    private StudentRepository studentRepository;

    public List<SimpleStudentDto> getAllStudents(){
      return  studentRepository.findAll()
                .stream()
                .map(student -> studentMapper.convertToDto(student))
                .collect(Collectors.toList());
    }
}
