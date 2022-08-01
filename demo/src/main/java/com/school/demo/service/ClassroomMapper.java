package com.school.demo.service;

import com.school.demo.dto.ClassroomDto;
import com.school.demo.entity.Classroom;

public class ClassroomMapper implements Mapper<Classroom, ClassroomDto> {
    @Override
    public ClassroomDto convertToDto(Classroom classroom) {
        ClassroomDto result = new ClassroomDto();

        return result;
    }

    @Override
    public Classroom convertToEntity(ClassroomDto classroomDto) {
        return null;
    }
}
