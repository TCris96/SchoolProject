package com.school.demo.service;

import org.springframework.stereotype.Service;


public interface Mapper<E,D> {
    D convertToDto(E e);
    E convertToEntity(D d);
}
