package com.karthi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

//	@PostMapping("login")
//	public String login(HttpServletRequest req, Model m) {
//		System.out.println("Inside Controller");
//		String name = req.getParameter("name");
//		String pwd = req.getParameter("password");
//		m.addAttribute("uname", name);
//		m.addAttribute("upwd", pwd);
//		return "Login";
//	}
	
//	@PostMapping("register")
//	public String register() {
//		return "Register";
//	}
	
	@PostMapping("login")
	public ModelAndView login(@ModelAttribute("bean")User user) {
		ModelAndView mv = new ModelAndView("Login");
		System.out.println("Inside Controller");
		mv.addObject("bean", user);
		return mv;
	}
}
