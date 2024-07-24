package com.nandha.Myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nandha.Myapp.bean.Login;
import com.nandha.Myapp.bean.Register;
import com.nandha.Myapp.dao.Dao;

@Controller
public class Homecontroller {
	
	@Autowired
	Dao dao;
	
//	Dao dao = new Dao();
	
	@RequestMapping("/")
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
	
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("calculator")
	public String calculator() {
		return "calculator";
	}
	
	
	@PostMapping("Log")
	public ModelAndView dologin(@ModelAttribute("bean") Login log) {
			
		ModelAndView mv = new ModelAndView("login");
		
		int n = dao.loginProcess(log);

		
//		if(log.name.equals("Nandha") && log.password.equals("nandha123")){
//		if(log.getName().equals("Nandha") && log.getPassword().equals("nandha123")){
		if(n > 0) {
			mv.addObject("Action", "Success");
		}
		else {
			mv.addObject("Action", "Failure");
		}
		return mv;
			
	}
	
	@PostMapping("registration")
	public ModelAndView doRegister(@ModelAttribute("bean1") Register reg) {
		
		ModelAndView mv = new ModelAndView("register");
		
		int n = dao.registerProcess(reg);
	
		if(n > 0) {
			mv.addObject("Action", "Failure");
		}
		else {
			mv.addObject("Action", "Success");
		}
		return mv;
			
	}
	
	@PostMapping("calculation")
	public ModelAndView doCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b, @RequestParam("op") String but) {
		
		ModelAndView mv = new ModelAndView("calculator");	  

		   int result = 0;
		   if ("add".equals(but)) {
		       result = a + b;
		   } else if ("sub".equals(but)) {
		       result = a - b;
		   } else if ("mul".equals(but)) {
		       result = a * b;
		   } else if ("div".equals(but)) {
			   
			   if(b>0) {
		       result = a / b;
			   }
			   else {
				   mv.addObject("Action", "Failure");
				   return mv;
			   }
		   }
		
		   mv.addObject("Action", "Success");
		mv.addObject("result", ""+result);
		return mv;
			
	}
	
	

	
}
