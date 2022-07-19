package com.school.demo;

import com.school.demo.entity.Address;
import com.school.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }

}
