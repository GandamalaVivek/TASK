package com.example.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.model.UserEnquiryResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserEnquiryService {

    @Value("${user.enquiry.api.url}")
    private String userEnquiryApiUrl;


    private Map<String, UserEnquiryResponse> userData = new HashMap<>();

    public UserEnquiryService() {

        userData.put("101", new UserEnquiryResponse("Anil", "Guthula", "Registered"));
        userData.put("102", new UserEnquiryResponse("Abhishek", "Gadde", "Not Registered"));
        userData.put("103", new UserEnquiryResponse("Surya", "Gidthuri", "Registered"));
        userData.put("104", new UserEnquiryResponse("Vivek", "G", "Registered"));

    }

    public String getFullNameWithStatus(String msisdn) {
        UserEnquiryResponse userEnquiryResponse = userData.get(msisdn);
        if (userEnquiryResponse != null) {
            String fullName = userEnquiryResponse.getFirstName() + " " + userEnquiryResponse.getLastName();
            String registrationStatus = userEnquiryResponse.getRegistrationStatus();
            return "Full name: " + fullName + "\nRegistration Status: " + registrationStatus;
        }
        return "User not found";
    }
}