package com.school.demo.service;

import com.school.demo.dto.TeacherDto;
import com.school.demo.entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper implements Mapper<Teacher, TeacherDto> {
    @Override
    public TeacherDto convertToDto(Teacher teacher) {
       TeacherDto result = new TeacherDto();
//       result.setClassroom(teacher.getClassroom());
//       result.setPerson(teacher.getPerson());

       return result;
    }

    @Override
    public Teacher convertToEntity(TeacherDto teacherDto) {
        Teacher result = new Teacher();
//        result.setClassroom(teacherDto.getClassroom());
//        result.setPerson(teacherDto.getPerson());

        return result;
    }
}
