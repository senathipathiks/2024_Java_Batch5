package com.prabha.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
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
		mv.addObject("Action",null);
		return mv;

	}
	
//	@RequestMapping("Register")
//	public ModelAndView Register() {
//		return "Register";
//
//	}
	
	@RequestMapping("validate")
	public ModelAndView validate(Login log) {
		String uname=log.getUname();
		String pwd = log.getPassword();
		ModelAndView mv = new ModelAndView("login");
		if((uname.equals("prabha") )&& (pwd.equals("prabha")))
		{
			mv.addObject("Action","Success");
		}
		else
		{
			mv.addObject("Action", "Failed");
			
		}
		return mv;

	}
	
	@RequestMapping("calculator")
	public ModelAndView calculator() {
		ModelAndView mv = new ModelAndView("calculator");
		mv.addObject("Action",null);
		return mv;

	}
	
	

	@PostMapping("calculate")
	public ModelAndView calculate(Calculator calc) {
		int n1=calc.getNum1();
		int n2 = calc.getNum2();
		ModelAndView mv = new ModelAndView("calculator");
		 mv.addObject("enter");
		 int n;
		 if(mv.equals("ADD")) {
			 n= n1 +n2;
		mv.addObject("Action",n);
 
		}

		return mv;
		
	}

}
