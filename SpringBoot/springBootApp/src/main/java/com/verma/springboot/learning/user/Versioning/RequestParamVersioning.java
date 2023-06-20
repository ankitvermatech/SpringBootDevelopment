package com.verma.springboot.learning.user.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamVersioning {


    @GetMapping(path = "username", params = "version=1")
    public UserDetails userName(){
        return new UserDetails("Ankit Verma");
    }

    @GetMapping(path = "username", params = "version=2")
    public UserDetailsV2 userNameV2(){
        return new UserDetailsV2(new NameV2("Ankit", "Verma"));
    }
}
