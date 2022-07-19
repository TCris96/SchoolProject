package com.school.demo.service;

import com.school.demo.entity.subjectenum.Subject;
import com.school.demo.entity.Grade;
import com.school.demo.entity.Student;
import com.school.demo.exception.StudentDatabaseEmpty;
import com.school.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.stream.Collectors.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void insertOrUpdate(Student student) {
        studentRepository.save(student);
    }

    public void delete(Student student) {
        if (Objects.nonNull(student)) {
            studentRepository.delete(student);
        }
    }

    public void displayGrades(int idStudent) {
        studentRepository.findById(idStudent)
                .orElseThrow()
                .getGrades()
                .forEach(System.out::println);
    }

    public void displayAll() {
        List<Student> students = studentRepository.findAll();
        if (!students.isEmpty()) {
            students.forEach(System.out::println);
        } else {
            throw new StudentDatabaseEmpty();
        }
    }

    public void displayStudentsSituation() {
        studentRepository.findAll()
                .forEach(student -> {
                    if (student.getGrades().size() < 3) {
                        System.out.println("Incomplete situation for student with id " + student.getId());
                    } else {
                        System.out.print("Student: " + student.getFirstName() + " " + student.getLastName());
                        getStudentGrades(student.getId()).entrySet()
                                .forEach(entry -> System.out.println("Subject: " + entry.getKey() + ": " + getGrades(entry.getValue())));
                    }
                });
    }

    private Map<Subject, List<Grade>> getStudentGrades(int studentId) {
        return studentRepository.findById(studentId).get().getGrades().stream()
                .collect(groupingBy(Grade::getSubject));

    }

    private List<Integer> getGrades(List<Grade> values) {
        return values.stream()
                .map(Grade::getValue)
                .collect(toList());
    }


}
