package com.supraja.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	   public String home1()
	   {
		   return "index1";
	   }
	
	@RequestMapping("hello")
   public String home()
   {
	   return "index";
   }
	
	@RequestMapping("home")
	public String Home()
	{
		return "Home";
	}
	
	@RequestMapping("login")
	public String Login()
	{
		return "Login";
	}
	
	@RequestMapping("register")
	public String Register()
	{
		return "Register";
	}
	
}
