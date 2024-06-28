package com.karthi.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("")
	public String index() {
		return "Calculator";
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
		if(user.getName().equals("karthi") && user.getPassword().equals("123")) {
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
	
	@PostMapping("Calculate")
	public ModelAndView calculate(@RequestParam("num1") int a, @RequestParam("num2") int b, @RequestParam("but") String button) {
		ModelAndView mv = new ModelAndView("Calculator");
		int ans=0;
		if(button.equals("Add")) {
			ans = a + b;
		}
		if(button.equals("Sub")) {
			ans = a - b;
		}
		if(button.equals("Mul")) {
			ans = a * b;
		}
		if(button.equals("Div")) {
			if(b == 0) {
				mv.addObject("Action", "Fail");
				return mv;
			}
			else {
				ans = a / b;
			}
		}
		mv.addObject("Action", "Success");
		mv.addObject("Result", ""+ans);
		
		return mv;
	}
}