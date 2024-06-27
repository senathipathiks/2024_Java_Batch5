package com.keerthana.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("")
	public String index() {
		return "Login";
	}
	@PostMapping("LoginPage")
	public ModelAndView login(@ModelAttribute("bean") User use) {
	String name=use.getUsername();
	String pwd=use.getPassword();
		ModelAndView mv=new ModelAndView("Login");
		if(name.equals("keerthy") && pwd.equals("123")) {
			mv.addObject("Action", "Success");
		}else {
			mv.addObject("Action", "Failure");
		}
		return mv;
		
	}
}
