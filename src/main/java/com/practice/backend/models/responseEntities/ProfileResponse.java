package com.practice.backend.models.responseEntities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.practice.backend.models.UserInfo;


public class ProfileResponse {

    private String username;
    private String email;
    private String firstName;
    private String secondName;
    private String phoneNumber;

    public ProfileResponse(UserInfo user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.secondName = user.getSecondName();
        this.phoneNumber = user.getPhoneNumber();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
