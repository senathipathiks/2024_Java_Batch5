package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("Welcome")
	public String message() {
		System.out.println("Inside Message");
		return "Welcome";
	}
}