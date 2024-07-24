package com.supraja.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
//   @RequestMapping("Login")
////   public String doLogin(HttpServletRequest req,Model m)
//   public String doLogin(@RequestParam ("name") String uname, @RequestParam("pass") String pwd,Model m)
//   {
//	   System.out.println("Inside Controller");
////	   String uname=req.getParameter("name");
////	   String pwd=req.getParameter("pass");
//	   m.addAttribute("uname",uname);
//	   m.addAttribute("pwd" ,pwd);
//	   
//	   return "LoginSuccess";
//   }
	
	
	@RequestMapping("Login")
	public ModelAndView doLogin(@ModelAttribute("bean") User user1)
	{
		System.out.println("Inside Model Controller");
		ModelAndView mv=new ModelAndView("LoginSuccess");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
	}
}
