package com.verma.springboot.learning.user.versioning;

public class UserDetailsV2 {

    private NameV2 userName;

    public UserDetailsV2(NameV2 userName) {
        this.userName = userName;
    }

    public NameV2 getUserName() {
        return userName;
    }

    public void setUserName(NameV2 userName) {
        this.userName = userName;
    }
}
