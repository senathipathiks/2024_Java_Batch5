package com.vidhu.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

 
@Controller
public class MainController {
	
	@RequestMapping("login")
	//public String doLogin(HttpServletRequest req,Model m) {
	
//	public String doLogin(@RequestParam("name") String uname, @RequestParam("pass")String pwd,Model m) {
//		System.out.println("Inside Controller");
////		String uname = req.getParameter("name"); String pwd = req.getParameter("pass"); 
//		// to not use the above code of line we use @ RequestParam 
//		m.addAttribute("uname",uname);
//		m.addAttribute("pwd", pwd);
//		return "login";
//		
//	}
	public ModelAndView doLogin(@ModelAttribute("bean")User user1) {
		
		ModelAndView mv=new ModelAndView("login");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv; 
	}

}
