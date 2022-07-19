package com.school.demo.service;

import com.school.demo.dto.GradeDto;
import com.school.demo.entity.Grade;

public class GradeMapper implements Mapper<Grade, GradeDto> {

    @Override
    public GradeDto convertToDto(Grade entity) {
        GradeDto result = new GradeDto();
        result.setDate(entity.getDate());
        result.setId(entity.getId());
        result.setStudent(entity.getStudent());
        result.setSubject(entity.getSubject());
        result.setValue(entity.getValue());

        return result;
    }

    @Override
    public Grade convertToEntity(GradeDto dto) {
        Grade result = new Grade();
        result.setDate(dto.getDate());
        result.setId(dto.getId());
        result.setStudent(dto.getStudent());
        result.setSubject(dto.getSubject());
        result.setValue(dto.getValue());

        return result;
    }
}
