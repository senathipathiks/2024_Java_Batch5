package com.gopi.controller;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;



//	@RequestMapping("Login")
//	public String message(@RequestParam("name") String uname, @RequestParam("pass") String pwd, Model m) {
////	public String message(HttpServletRequest req,Model m) {
////		System.out.println("Inside Controller");
////		String uname=req.getParameter("name");
////		String pwd=req.getParameter("pass");
//		m.addAttribute("uname",uname);
//		m.addAttribute("pwd",pwd);
//
//		return "Login";
//	}
	
@Controller
public class Welcome {
	@RequestMapping(value="login", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("bean") User user1) {
		
		ModelAndView mv = new ModelAndView("Login");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
	}
}
