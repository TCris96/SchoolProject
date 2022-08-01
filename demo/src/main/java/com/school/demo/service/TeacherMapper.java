package com.school.demo.service;

import com.school.demo.dto.TeacherDto;
import com.school.demo.entity.Teacher;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TeacherMapper implements Mapper<Teacher, TeacherDto> {
    @Override
    public TeacherDto convertToDto(Teacher teacher) {
       TeacherDto result = new TeacherDto();
        result.setId(teacher.getId());
        result.setAge(teacher.getPerson().getAge());
        result.setFirstName(teacher.getPerson().getFirstName());
        result.setLastName(teacher.getPerson().getLastName());
        result.setAddressId(teacher.getPerson().getAddress().getId());
        result.setClassroomId(teacher.getClassroom().getId());

       return result;
    }

    @Override
    public Teacher convertToEntity(TeacherDto teacherDto) {
        Teacher result = new Teacher();
        result.setId(teacherDto.getId());
        result.getPerson().setAge(teacherDto.getAge());
        result.getPerson().setLastName(teacherDto.getLastName());
        result.getPerson().setFirstName(teacherDto.getFirstName());
        result.getClassroom().setId(teacherDto.getClassroomId());
        result.getPerson().getAddress().setId(teacherDto.getAddressId());
        return result;
    }
}
