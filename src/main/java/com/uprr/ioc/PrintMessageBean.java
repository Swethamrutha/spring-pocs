package com.uprr.ioc;

public class PrintMessageBean {

    private String message;

    public String getMessage() {
        System.out.println("My Message : "+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
