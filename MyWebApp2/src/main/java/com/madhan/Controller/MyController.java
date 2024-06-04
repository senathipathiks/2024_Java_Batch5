package com.madhan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("register")
	public String doRegister()
	{
		System.out.println("Inside Register");
		return "Registration";
	}
	
	@RequestMapping("Login")
	public String doLogin()
	{
		return "Login";
	}

}
