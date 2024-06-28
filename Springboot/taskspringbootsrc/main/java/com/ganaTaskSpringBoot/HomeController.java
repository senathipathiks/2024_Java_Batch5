package com.ganaTaskSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping("Login")
	public ModelAndView Login(User user) {
		
		String username = user.getUsername();
		String password = user.getPassword();
		ModelAndView mv = new ModelAndView("login");
		if((username.equals("gana"))&&(password.equals("gana")))
		{
			mv.addObject("Action","Success");
		}
		else
		{
			mv.addObject("Action","Failure");
		}
		return mv;
	}
	@RequestMapping("registration")
	public String registration() {
		return "registration";
	}
	

}

