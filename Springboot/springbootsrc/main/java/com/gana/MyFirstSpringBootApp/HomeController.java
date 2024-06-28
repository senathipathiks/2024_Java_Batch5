package com.gana.MyFirstSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("")
	public String index() {
		return "index";
	}
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("registration")
	public String registration() {
		return "registration";
	}
	

}
