package com.aravind.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.rest.model.User;

import com.aravind.rest.serviceimpl.UserServiceImpl;

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

	@PostMapping("/login")
	public String doLogin(@RequestBody User user) {
		String msg = service.login(user);
			return msg;

	}

}
