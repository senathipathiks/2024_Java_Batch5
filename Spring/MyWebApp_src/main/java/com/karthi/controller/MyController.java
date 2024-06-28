package com.karthi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("welcome")
	public String message() {
		System.out.println("Inside Message");
		return "Welcome";
	}
}