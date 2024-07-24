package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MyController {

//	@RequestMapping(value="login", method = RequestMethod.POST)
////	public String doLogin(HttpServletRequest req, Model m) {
//		public String doLogin(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd, Model m) {
//		
//		System.out.println("Inside Controller");
////		String uname = req.getParameter("uname");
////		String pwd = req.getParameter("pwd");
//		m.addAttribute("uname", uname);
//		m.addAttribute("pwd", pwd);
//
//		return "LoginSuccess";
//		
//	}
	
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("bean")User user1) {
		
		ModelAndView mv = new ModelAndView("LoginSuccess");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
		
	}

	
	
}