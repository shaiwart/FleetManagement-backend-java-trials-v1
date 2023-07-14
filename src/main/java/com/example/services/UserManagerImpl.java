package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repositories.UserRepository;

@Service
public class UserManagerImpl implements UserManager {
	
	@Autowired
	UserRepository userRepo; 

	@Override
	public void addUser(User user) {
		userRepo.save(user); 
	}

	@Override
	public User findById(int id) {
		return userRepo.findById(id); 
	}

}
