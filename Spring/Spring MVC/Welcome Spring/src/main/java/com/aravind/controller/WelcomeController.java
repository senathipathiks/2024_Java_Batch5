package com.aravind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome")
	//@PostMapping("welcome")
	public String message() {
		System.out.println("Inside Message");
		return "Welcome"; //return the model
	}

}
