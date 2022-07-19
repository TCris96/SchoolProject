package com.school.demo.repository;

import com.school.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Integer> {
    List<Address> findByStreetName(String streetName);

    List<Address> findByCity(String city);

}
