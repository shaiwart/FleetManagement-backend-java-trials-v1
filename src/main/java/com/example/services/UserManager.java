package com.example.services;

import com.example.entities.User;

public interface UserManager {
	
	void addUser(User user); 
	
	User findById(int id);  
}
