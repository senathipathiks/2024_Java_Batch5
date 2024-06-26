	package com.gopi.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home() {
		
		ModelAndView mv  = new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("")
	public ModelAndView index() {
		
		ModelAndView mv  = new ModelAndView("Index");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView login() {
		
		ModelAndView mv  = new ModelAndView("Login");
		mv.addObject("Action",null);
		return mv;
	}
	
	@RequestMapping("reg")
	public ModelAndView reg() {
		
		ModelAndView mv  = new ModelAndView("Reg");
		return mv;
	}
	
	@RequestMapping("Validate")
	public ModelAndView Validate(Login log) {
		
		String username = log.getUsername();
		String pass = log.getPass();
		ModelAndView mv  = new ModelAndView("Login");
		if(username.equals("Gopi") && pass.equals("1234")) {
			mv.addObject("Action","Success");
		}
		else {
			mv.addObject("Action","Failure");
		}
		
		return mv;
	}
}
