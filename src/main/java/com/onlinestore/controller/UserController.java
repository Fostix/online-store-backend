package com.onlinestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.model.User;
import com.onlinestore.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository; 
	
	@GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
