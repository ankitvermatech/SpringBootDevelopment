package com.verma.springboot.learning.user.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentVersioning {


    @GetMapping(path = "username", produces = "application/app-v1+json")
    public UserDetails userName(){
        return new UserDetails("Ankit Verma");
    }

    @GetMapping(path = "username", produces = "application/app-v2+json")
    public UserDetailsV2 userNameV2(){
        return new UserDetailsV2(new NameV2("Ankit", "Verma"));
    }
}
