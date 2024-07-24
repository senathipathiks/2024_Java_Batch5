package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

	@PostMapping("register")
	public String doRegister() {
		System.out.println("Inside Register");
		return "Register";
		
	}
	
	@PostMapping("login")
	public String doLogin() {
		System.out.println("Inside Login");
		return "Login";
		
	}
	
	
	
}