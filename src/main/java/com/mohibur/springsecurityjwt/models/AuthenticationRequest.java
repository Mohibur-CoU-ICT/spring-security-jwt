package com.mohibur.springsecurityjwt.models;

public class AuthenticationRequest {
    String username;
    String password;

    public AuthenticationRequest() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
