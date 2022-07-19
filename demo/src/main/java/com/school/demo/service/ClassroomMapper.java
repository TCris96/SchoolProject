package com.school.demo.service;

import com.school.demo.dto.ClassroomDto;
import com.school.demo.entity.Classroom;

public class ClassroomMapper implements Mapper<Classroom, ClassroomDto> {
    @Override
    public ClassroomDto convertToDto(Classroom entity) {
        ClassroomDto result = new ClassroomDto();
        result.setId(entity.getId());
        result.setStudents(entity.getStudents());
        result.setTeacher(entity.getTeacher());

        return result;
    }

    @Override
    public Classroom convertToEntity(ClassroomDto dto) {
        Classroom result = new Classroom();
        result.setId(dto.getId());
        result.setStudents(dto.getStudents());
        result.setTeacher(dto.getTeacher());

        return result;
    }
}
