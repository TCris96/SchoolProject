package com.school.demo.service;

import com.school.demo.entity.subjectenum.Subject;
import com.school.demo.entity.Classroom;
import com.school.demo.entity.Grade;
import com.school.demo.entity.Student;
import com.school.demo.entity.Teacher;
import com.school.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private StudentService studentService;

    public void insert(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void delete(Teacher teacher) {
        if (teacher != null){
            teacherRepository.delete(teacher);
        }
    }

    public void displayAll() {
        List<Teacher> all = teacherRepository.findAll();
        for (Teacher teacher : all) {
            System.out.println(teacher);
        }
    }
    public List<Teacher> findBySubject(Subject subject){
        List<Classroom> classroomList = classroomService.findBySubject(subject);
         return classroomList.stream()
                .map(Classroom::getTeacher)
                .collect(Collectors.toList());
    }
    public void addGrades(Student student, List<Grade> grades){
        grades.forEach(grade -> addGrade(student,grade,false));
        studentService.insertOrUpdate(student);
    }

    public void addGrade(Student student, Grade grade,boolean updateStudent) {
       student.getGrades().add(grade);
       if(updateStudent){
           studentService.insertOrUpdate(student);
       }
    }
}
