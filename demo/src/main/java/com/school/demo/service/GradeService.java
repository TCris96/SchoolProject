package com.school.demo.service;

import com.school.demo.entity.Grade;
import com.school.demo.repository.GradeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GradeService {

    private GradeRepository gradeRepository;
    private GradeMapper gradeMapper;

    public void insert(Grade grade) {
        gradeRepository.save(grade);
    }

    public void delete(Grade grade) {
        if (grade != null) {
            gradeRepository.delete(grade);
        }
    }

}
