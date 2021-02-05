package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.RegisterService;

@RestController
public class HomeController {
    
	@Autowired
	RegisterService register;
	
	/*
	 * @GetMapping("/user") public String register(){ return register.register(); }
	 */
    
    @PostMapping("/user/login")
     public User login()
     {
    	if(register.login()!=null)
    	{
    		return register.login();
    	}
    	else
    	{
    		return null;
    	}
     }
    
    @PostMapping("/user")
    public ResponseEntity<User> register(){
        return new ResponseEntity<>(register.register(),HttpStatus.CREATED);
    }
    
    
}
