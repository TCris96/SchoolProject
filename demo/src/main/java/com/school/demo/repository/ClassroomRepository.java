package com.school.demo.repository;

import com.school.demo.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Integer> {

}
