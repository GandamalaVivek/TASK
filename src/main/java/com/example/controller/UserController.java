package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserEnquiryService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserEnquiryService userEnquiryService;

    @GetMapping("/{msisdn}")
    public String getFullNameWithStatus(@PathVariable String msisdn) {
        return userEnquiryService.getFullNameWithStatus(msisdn);
    }
}
