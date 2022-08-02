package com.school.demo.service;

import com.school.demo.dto.AddressDto;
import com.school.demo.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper implements Mapper<Address,AddressDto> {
    @Override
    public AddressDto convertToDto(Address address) {
        AddressDto result = new AddressDto();
        result.setId(address.getId());
        result.setStreetNo(address.getStreetNo());
        result.setCity(address.getCity());
        result.setBuilding(address.getBuilding());
        result.setStreetName(address.getStreetName());

        return result;
    }

    @Override
    public Address convertToEntity(AddressDto addressDto) {
        Address result = new Address();
        result.setId(addressDto.getId());
        result.setStreetNo(addressDto.getStreetNo());
        result.setCity(addressDto.getCity());
        result.setBuilding(addressDto.getBuilding());
        result.setStreetName(addressDto.getStreetName());

        return result;
    }
}
