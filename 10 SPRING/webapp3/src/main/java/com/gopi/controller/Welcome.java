package com.gopi.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Welcome {
	@RequestMapping("Welcome")
	public String messege() {
		return "Welcome";
	}
}
