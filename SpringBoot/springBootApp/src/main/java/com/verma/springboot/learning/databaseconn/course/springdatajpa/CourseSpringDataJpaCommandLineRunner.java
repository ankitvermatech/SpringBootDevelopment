package com.verma.springboot.learning.databaseconn.course.springdatajpa;

import com.verma.springboot.learning.databaseconn.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(3l,"Do Epic Shit", "Ankur Warikoo"));
        repository.save(new Course(4l,"Rich Dad Poor Dad", "Robert T Kiyosaki"));
        repository.save(new Course(5l,"Think like a Monk", "Jay Shetty"));
        repository.deleteById(5l);
        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(4l));
    }
}
