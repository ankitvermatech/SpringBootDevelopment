package com.verma.springboot.learning.springfiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFiltering {

    @GetMapping("/static-filtering")//ignore field2=value2
    public SomeBean filterFields(){
        return new SomeBean("Value1","Value2","Value3");
    }
}
