package com.SpringBoot.Eg1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("")
	public String index() {
		return "index";
	}
 
	@RequestMapping("Home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("Login")
	public String login() {
		return "Login";
	}
 
	@PostMapping("LoginValidate")
	public ModelAndView loginValidate(@ModelAttribute("bean") User user) {
		ModelAndView mv = new ModelAndView("Login");
		if(user.getName().equals("TMGA") && user.getPassword().equals("123")) {
			mv.addObject("Action", "Success");
		}
		else {
			mv.addObject("Action", "Fail");
		}
		return mv;
	}
 
	@RequestMapping("Register")
	public String register() {
		return "Register";
	}
}
