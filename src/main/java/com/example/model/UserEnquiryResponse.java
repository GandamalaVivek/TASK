package com.example.model;
public class UserEnquiryResponse {

    private String firstName;
    private String lastName;
    private String registrationStatus;

    public UserEnquiryResponse(String firstName, String lastName, String registrationStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationStatus = registrationStatus;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
}
