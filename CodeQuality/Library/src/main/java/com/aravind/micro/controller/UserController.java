package com.aravind.micro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.micro.model.User;

import com.aravind.micro.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {
	@Autowired
	UserServiceImpl service;

	static final String SUCCESS = "Success";
	static final String FAILURE = "Failure";

	@PostMapping("/register")
	public String addUser(@RequestBody User user) {

			try {
				service.addUser(user);
				return "Registered Successfully";
			} catch (Exception e) {
				return "Failure";
			}
		
	}


	
	@PostMapping("{username}/{password}")
	public User doLogin(@PathVariable("username") String username, @PathVariable("password") String password) {
		User user = service.login(username, password);
		if(user != null) {
			return user;
		}
		return null;
		
		
	}
	

	
}
