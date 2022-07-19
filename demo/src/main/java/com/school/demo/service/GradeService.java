package com.school.demo.service;

import com.school.demo.entity.Grade;
import com.school.demo.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public void insert(Grade grade) {
        gradeRepository.save(grade);
    }

    public void delete(Grade grade) {
        if (grade != null) {
            gradeRepository.delete(grade);
        }
    }

}
