package com.school.demo.repository;

import com.school.demo.entity.subjectenum.Subject;
import com.school.demo.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassroomRepository extends JpaRepository<Classroom,Integer> {
    List<Classroom> findBySubject(Subject subject);
}
