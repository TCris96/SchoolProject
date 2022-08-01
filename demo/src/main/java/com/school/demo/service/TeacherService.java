package com.school.demo.service;

import com.school.demo.dto.StudentDto;
import com.school.demo.dto.TeacherDto;
import com.school.demo.entity.Student;
import com.school.demo.entity.Teacher;
import com.school.demo.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeacherService {

    private TeacherMapper teacherMapper;
    private TeacherRepository teacherRepository;

    public List<TeacherDto> getAllTeachers(){
        return teacherRepository.findAll()
                .stream()
                .map(teacher -> teacherMapper.convertToDto(teacher))
                .collect(Collectors.toList());
    }

    public TeacherDto createStudent(TeacherDto teacherDto){
        Teacher teacher = teacherMapper.convertToEntity(teacherDto);
        teacher=teacherRepository.save(teacher);
        return teacherMapper.convertToDto(teacher);
    }
}
