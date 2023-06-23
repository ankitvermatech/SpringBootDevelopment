package com.verma.springboot.learning.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new User(1,"Ankit", LocalDate.now().minusYears(26)));
        repository.save(new User(2,"Ankur", LocalDate.now().minusYears(26)));
        repository.save(new User(3,"Abhishek", LocalDate.now().minusYears(26)));
    }
}
