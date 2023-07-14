package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.User;
import com.example.services.UserManager;

@RestController
public class UserController {
	
	@Autowired
	UserManager userMan; 
	
	
	// add a user
	@PostMapping(value="api/user") 
	public void addUser(@RequestBody User user) {
		userMan.addUser(user); 
	}
	
	
	// get a user by id 
	@GetMapping(value="api/{id}")
	public User findById(@PathVariable int id) {
		return userMan.findById(id); 
	}
}
