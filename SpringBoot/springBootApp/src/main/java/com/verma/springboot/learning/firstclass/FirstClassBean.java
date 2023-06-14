package com.verma.springboot.learning.firstclass;

public class FirstClassBean {

    private String message;

    public FirstClassBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "firstClassBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
