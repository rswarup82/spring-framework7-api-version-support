package com.allybank.customer.controllers;

import com.allybank.customer.models.User;
import com.allybank.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path="user-details/{id}")
    public User getUserDetails(@PathVariable String id) {
        if (id.isEmpty()) {
            throw new NumberFormatException("Input Parameter user ID is null or empty.");
        }
        return userService.getUserById(Long.parseLong(id));
    }

    @GetMapping(path="user-details/{id}", version="1.1")
    public User getUserDetails1_1(@PathVariable String id) {
        if (id.isEmpty()) {
            throw new NumberFormatException("Input Parameter user ID is null or empty.");
        }
        return userService.getUserById1_1(Long.parseLong(id));
    }

    @GetMapping(path="user-details/{id}", version="1.2+")
    public User getUserDetails1_2(@PathVariable String id) {
        if (id.isEmpty()) {
            throw new NumberFormatException("Input Parameter user ID is null or empty.");
        }
        return userService.getUserById1_2(Long.parseLong(id));
    }
}
