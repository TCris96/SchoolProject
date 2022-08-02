package com.school.demo.service;

import com.school.demo.dto.AddressDto;
import com.school.demo.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AddressService {

    private AddressMapper addressMapper;
    private AddressRepository addressRepository;

    public List<AddressDto> getAllAddresses(){
       return addressRepository.findAll()
               .stream()
               .map(add -> addressMapper.convertToDto(add))
               .collect(Collectors.toList());
    }
}
