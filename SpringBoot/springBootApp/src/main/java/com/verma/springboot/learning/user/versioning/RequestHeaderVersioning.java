package com.verma.springboot.learning.user.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderVersioning {


    @GetMapping(path = "username", headers = "version=1")
    public UserDetails userName(){
        return new UserDetails("Ankit Verma");
    }

    @GetMapping(path = "username", headers = "version=2")
    public UserDetailsV2 userNameV2(){
        return new UserDetailsV2(new NameV2("Ankit", "Verma"));
    }
}
