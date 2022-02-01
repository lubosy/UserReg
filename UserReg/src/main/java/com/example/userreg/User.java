package com.example.userreg;

import jakarta.persistence.*;

import java.io.Serializable;


public class User implements Serializable {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public User() {

    }

    private String username;
    private String userpass;

    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }
}
