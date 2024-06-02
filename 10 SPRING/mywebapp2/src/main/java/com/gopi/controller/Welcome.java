package com.gopi.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	
	
//	@GetMapping
//	@PostMapping
//	@PutMapping
//	@PostMapping("Welcome")
	@RequestMapping("Welcome")
	public String message() {
		return "Welcome";
	}
	
	@RequestMapping("Login")
	public String login() {
		return "Login";
	}
//	
}
