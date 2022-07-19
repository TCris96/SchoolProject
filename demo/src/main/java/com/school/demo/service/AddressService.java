package com.school.demo.service;

import com.school.demo.entity.Address;
import com.school.demo.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
@AllArgsConstructor
public class AddressService {

    private AddressRepository addressRepository;
    private AddressMapper addressMapper;

    public void add(Address address) {
         addressRepository.save(address);
    }
    public void delete(Address address){
        if(nonNull(address)){
            addressRepository.delete(address);
        }
    }
    public Address findById(int addressId){
        return addressRepository.findById(addressId).orElseThrow();
    }
    public List<Address> findByCity(String city){
       return addressRepository.findByCity(city);
    }
    public List<Address> findByStreetName(String streetName){
        return addressRepository.findByStreetName(streetName);
    }
}
