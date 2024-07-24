package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("welcome")
	public String message() {
		System.out.println("Inside message");
		return "Welcome";
		
	}
	
}
