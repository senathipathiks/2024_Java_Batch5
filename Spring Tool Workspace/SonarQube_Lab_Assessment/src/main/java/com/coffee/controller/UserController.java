package com.coffee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.model.User;
import com.coffee.serviceimplementation.UserSerImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {
	
	UserSerImpl service;

	public UserController(UserSerImpl service) {
		super();
		this.service = service;
	}
	
	String done = "Success";
	String notdone = "Failure";
	
	@PostMapping
	public String addUser(@RequestBody User user) {
		String msg="";
		try {
			service.addUser(user);
			msg = done;
		}
		catch(Exception e) {
			msg= notdone;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Optional<User> getUserById(@PathVariable("id") int id) {
		return service.getUser(id);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return service.viewAllUser();
	}
	
	@PutMapping
	public String updateUserById(@RequestBody User user) {
		String msg="";
		try {
			service.updUser(user);
			msg = done;
		}
		catch(Exception e) {
			msg = notdone;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public void delUserById(@PathVariable("id") int id) {
		service.delUser(id);
	}
}
