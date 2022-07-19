package com.school.demo.service;

import com.school.demo.entity.subjectenum.Subject;
import com.school.demo.entity.Classroom;
import com.school.demo.exception.ClassroomNotFoundException;
import com.school.demo.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    public void insert(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    public void delete(Classroom classroom) {
        if (classroom != null) {
            classroomRepository.delete(classroom);
        }
    }

    public Classroom findById(int idClassroom) {
        return classroomRepository.findById(idClassroom).orElseThrow(ClassroomNotFoundException::new);
    }

    public List<Classroom> findBySubject(Subject subject) {
        return classroomRepository.findBySubject(subject);
    }
}