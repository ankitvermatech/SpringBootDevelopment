package com.verma.springboot.learning.user.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLVersioning {

    @GetMapping("v1/username")
    public UserDetails userName(){
        return new UserDetails("Ankit Verma");
    }

    @GetMapping("v2/username")
    public UserDetailsV2 userNameV2(){
        return new UserDetailsV2(new NameV2("Ankit", "Verma"));
    }
}
