package com.allybank.customer.service;

import com.allybank.customer.entities.UserDomain;
import com.allybank.customer.models.User;
import com.allybank.customer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        UserDomain userDomain = this.userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new User(String.valueOf(userDomain.getId()), userDomain.getFirstName(), userDomain.getLastName());
    }

    public User getUserById1_1(Long id) {
        UserDomain userDomain = this.userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new User(String.valueOf(userDomain.getId()), userDomain.getFirstName(), userDomain.getLastName(), userDomain.getEmailAddress(), userDomain.getPhoneNumber());
    }

    public User getUserById1_2(Long id) {
        UserDomain userDomain = this.userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new User(String.valueOf(userDomain.getId()), userDomain.getFirstName(), userDomain.getLastName(), userDomain.getEmailAddress(), userDomain.getPhoneNumber(), null);
    }
}
