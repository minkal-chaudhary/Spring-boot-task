package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class RegisterService {

	
	public User register() {
		return new User(12,"minkal");
	}

	public User login() {
		
		return new User(13,"toshi");
	}
	
}
