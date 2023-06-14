package com.verma.springboot.learning.firstclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstClass {

    @GetMapping(path = "/first-class")
    public String firstMethod(){
        return "Hello";
    }

    @GetMapping(path = "/first-class-bean")
    public FirstClassBean firstClassBean(){
        return new FirstClassBean("Hello Ankit");
    }

    @GetMapping(path = "/first-class/student/{name}")
    public FirstClassBean studentName(@PathVariable String name){
        return new FirstClassBean(String.format("Hello %s",name));
    }

}
