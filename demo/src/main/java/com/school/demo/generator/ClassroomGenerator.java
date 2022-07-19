package com.school.demo.generator;

import com.school.demo.entity.subjectenum.Subject;
import com.school.demo.entity.Address;
import com.school.demo.entity.Classroom;
import com.school.demo.entity.Student;
import com.school.demo.entity.Teacher;
import com.school.demo.service.AddressService;
import com.school.demo.service.ClassroomService;
import com.school.demo.service.StudentService;
import com.school.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassroomGenerator {
    @Autowired
    private AddressService addressService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private TeacherService teacherService;

    public void generateClassroom() {
        Address address1 = new Address("Bucharest", "Iuliu Maniua", 10, "1C");
        addressService.add(address1);
        Teacher teacher = new Teacher("Popescu", "Ion", 40,address1);
        teacherService.insert(teacher);
        Classroom chemistryClass = new Classroom(teacher);


        List<Student> students = new ArrayList<>();
        Address firstStudentAddress = new Address("Craiova", "A.I.Cuza", 4, "5A");
        addressService.add(firstStudentAddress);
        Student firstStudent = new Student("Cristina", "Tufan", 25,firstStudentAddress);
        studentService.insertOrUpdate(firstStudent);
        students.add(firstStudent);
        Address secondStudentAddress =  new Address("Craiova", "Decebal", 7, "3");
        addressService.add(secondStudentAddress);
        Student secondStudent = new Student("Mihaela", "Popa", 24,secondStudentAddress);
        studentService.insertOrUpdate(secondStudent);

        students.add(secondStudent);

        chemistryClass.setStudents(students);
        classroomService.insert(chemistryClass);

        firstStudent.setClassroom(chemistryClass);
        secondStudent.setClassroom(chemistryClass);
        studentService.insertOrUpdate(firstStudent);
        studentService.insertOrUpdate(secondStudent);

        teacher.setClassroom(chemistryClass);
        teacherService.insert(teacher);
    }


}
