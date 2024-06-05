package com.vidhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

	
	 @PostMapping("/register")
	public String doRegsiter() {
		return "register";
	}
	
	@PostMapping("/login")
	public String doLogin() {
		return "login";
	}
	
}
