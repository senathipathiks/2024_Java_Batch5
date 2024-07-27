package com.spring.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
//	@RequestMapping("Login")
////	public String doLogin(HttpServletRequest req, Model m) {
//		public String doLogin(@RequestParam("name") String uname, @RequestParam("pass") String pass, Model m) {
//		System.out.println("Inside Controller");
////		String uname = req.getParameter("name");
////		String pass = req.getParameter("pass");
//		m.addAttribute("uname",uname);
//		m.addAttribute("pass",pass);
//		return "LoginSuccess";
//	}
	
	@RequestMapping(value="Login", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("bean")User user1) {
		
		ModelAndView mv = new ModelAndView("LoginSuccess");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
		
	}
	
}
