package com.school.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleStudentDto {

    private long id;
    private PersonWithFullNameDto person;
    private Long personId;

}
