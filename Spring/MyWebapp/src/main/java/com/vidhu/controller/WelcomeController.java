package com.vidhu.controller;


import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {
	
	@PostMapping("welcome")
	public String message() {
		
		System.out.println("---");
		return "Welcome";
	}
	
	

}

