package com.srienath.webapp3;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController3 {
//	@RequestMapping("login")
//	public String doLogin(HttpServletRequest req,Model m) {
//		
//	}
	
//	@RequestMapping("login")
//	public String doLogin(@RequestParam("name") String uname,@RequestParam("pass") String pwd,Model m)
//	{
//		System.out.println("Inside Controller");
////		String uname=req.getParameter("name");
////		String pwd=req.getParameter("pass");
//		m.addAttribute("uname",uname);
//		m.addAttribute("pwd",pwd);
//		return "LoginSuccess";
//		
//	}
	@RequestMapping("login")
	public ModelAndView doLogin(@ModelAttribute("bean")User user1)
	{
		ModelAndView mv=new ModelAndView("LoginSuccess");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
	}
}