package com.verma.springboot.learning.databaseconn.course.jdbc;

import com.verma.springboot.learning.databaseconn.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoursejdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CoursejdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Do Epic Shit", "Ankur Warikoo"));
        repository.insert(new Course(2,"Rich Dad Poor Dad", "Robert T Kiyosaki"));
        repository.insert(new Course(3,"Think like a Monk", "Jay Shetty"));
        repository.delete(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
