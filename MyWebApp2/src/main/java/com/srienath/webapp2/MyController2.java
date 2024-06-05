package com.srienath.webapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	@RequestMapping("register")
	public String doRegister() 
	{
		System.out.println("Inside Register");
		return "Registration";
	}
	@RequestMapping("login")
	public String doLogin() 
	{
		return "Login";
	}
}
