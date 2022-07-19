package com.school.demo.service;

import com.school.demo.dto.AddressDto;
import com.school.demo.entity.Address;

public class AddressMapper implements Mapper<Address, AddressDto> {
    @Override
    public AddressDto convertToDto(Address entity) {
        AddressDto result = new AddressDto();
        result.setId(entity.getId());
        result.setBuilding(entity.getBuilding());
        result.setCity(entity.getCity());
        result.setStreetName(entity.getStreetName());
        result.setStreetNo(entity.getStreetNo());
        return result;

    }

    @Override
    public Address convertToEntity(AddressDto dto) {
        Address result = new Address();
        result.setId(dto.getId());
        result.setBuilding(dto.getBuilding());
        result.setCity(dto.getCity());
        result.setStreetName(dto.getStreetName());
        result.setStreetNo(dto.getStreetNo());
        return result;
    }
}
