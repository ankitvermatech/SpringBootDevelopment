package com.verma.springboot.learning.user.Versioning;

public class UserDetails {
    private String name;

    public UserDetails(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
