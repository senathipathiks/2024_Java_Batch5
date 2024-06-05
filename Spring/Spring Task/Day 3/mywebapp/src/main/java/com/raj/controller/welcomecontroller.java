package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomecontroller {
	@RequestMapping("welcome")
	public String message() {
		System.out.println("inside message");
		return "welcome";
	}
}
