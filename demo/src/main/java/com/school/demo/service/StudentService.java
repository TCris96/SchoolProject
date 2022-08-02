package com.school.demo.service;

import com.school.demo.dto.StudentDto;
import com.school.demo.entity.Student;
import com.school.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll()
                .stream()
                .map(student -> studentMapper.convertToDto(student))
                .collect(Collectors.toList());
    }
    public StudentDto findById(long id){
        Student foundedStudent = studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        return studentMapper.convertToDto(foundedStudent);
    }

    public StudentDto createStudent(StudentDto studentDto){
        Student student = studentMapper.convertToEntity(studentDto);
        student=studentRepository.save(student);
        return studentMapper.convertToDto(student);
    }
}
