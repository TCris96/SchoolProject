package com.school.demo.service;

import com.school.demo.dto.TeacherDto;
import com.school.demo.entity.Teacher;

public class TeacherMapper implements Mapper<Teacher, TeacherDto> {
    @Override
    public TeacherDto convertToDto(Teacher entity) {
        TeacherDto result = new TeacherDto();
        result.setClassroom(entity.getClassroom());
        result.setId(entity.getId());

        return result;
    }

    @Override
    public Teacher convertToEntity(TeacherDto dto) {
        Teacher result = new Teacher();
        result.setClassroom(dto.getClassroom());
        result.setId(dto.getId());

        return result;
    }
}
