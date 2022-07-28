package com.school.demo.service;

import com.school.demo.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private TeacherMapper teacherMapper;
    private TeacherRepository teacherRepository;
}
