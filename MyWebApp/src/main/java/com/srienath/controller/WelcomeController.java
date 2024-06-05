package com.srienath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@PostMapping("Welcome")
	public String message() {
		System.out.println("inside message");
		return "Welcome";
	}
 
}