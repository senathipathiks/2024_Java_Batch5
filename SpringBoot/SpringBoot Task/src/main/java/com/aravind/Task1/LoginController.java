package com.aravind.Task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String log() {
		return "Login";
	}
	
	@PostMapping("login")
	public ModelAndView dologin(@ModelAttribute("bean") User u) {
		ModelAndView mv = new ModelAndView("Login");
		if(u.getUser().equals("Aravind") && u.getPass().equals("Aravind2@")) {
			mv.addObject("Action","Success");
			
		}
		else {
			mv.addObject("Action","Failure");
		}
		return mv;
		
	}

}
