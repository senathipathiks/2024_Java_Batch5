package com.madhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@PostMapping("Welcome")
	public String message()
	{
		System.out.println("Inside Message");
		return "Welcome";
	}
}
