package com.school.demo.service;

public interface Mapper<E,D> {

    D convertToDto(E entity);
    E convertToEntity(D dto);



}
