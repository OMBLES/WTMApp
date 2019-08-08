package com.example.wtmapp;

public class User {
    public String name;
    public String profilePicture;
    public String phoneNumber;

    public User(String name, String profilePicture, String phoneNumber) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
