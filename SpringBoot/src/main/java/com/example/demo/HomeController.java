package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	
//	@RequestMapping("Login")
//	public String login() {
//		return "Login";
//	}
//	
	
	@Controller
	public class LoginController {
		
		@RequestMapping("Login")
		public String log() {
			return "Login";
		}
		
		@PostMapping("Login")
		public ModelAndView dologin(@ModelAttribute("bean") Login l) {
			ModelAndView mv = new ModelAndView("Login");
			if(l.getUname().equals("Vidhusha") && l.getPsw().equals("Vidhusha18")) {
				mv.addObject("Action","Success");
				
			}
			else {
				mv.addObject("Action","Failure");
			}
			return mv;
		}
		@RequestMapping("Calci")
		public ModelAndView calci() {
			ModelAndView mv = new ModelAndView("Calci");
			return mv;
		}
		
		@RequestMapping("perform")
		public  ModelAndView doVal(Calculator cal) {
			ModelAndView mv = new ModelAndView("Calci");
			int num1 = cal.getNum1();
			int num2 = cal.getNum2();
			int res = num1+num2;
			mv.addObject("Action",res);
			return mv;																																		
		}
}

}