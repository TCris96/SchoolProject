package com.school.demo;

import com.school.demo.generator.ClassroomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClassbookCommandLineRunner implements CommandLineRunner {
    @Autowired
    private ClassroomGenerator classroomGenerator;
    @Override
    public void run(String... args) throws Exception {
        classroomGenerator.generateClassroom();
    }
}
