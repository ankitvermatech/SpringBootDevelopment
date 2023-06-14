package com.verma.springboot.learning.user;

import com.verma.springboot.learning.user.UserDefinedException.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;


@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user==null){
            throw new UserNotFoundException("Id: "+id);
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> adduser(@RequestBody User user){
        User savedUser = service.saveUser(user);
        java.net.URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").
                buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
