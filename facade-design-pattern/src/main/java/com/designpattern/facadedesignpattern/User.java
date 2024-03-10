package com.designpattern.facadedesignpattern;


public class User {
    private String name;
    private String email;
    private String contactNumber;

    public User(String name, String email, String contactNumber) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

}
