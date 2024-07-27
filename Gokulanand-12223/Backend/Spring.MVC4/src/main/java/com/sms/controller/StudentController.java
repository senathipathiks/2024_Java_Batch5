package com.sms.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ComponentScan(basePackages = {"com.sms.controller"})
public class StudentController 
{
	@RequestMapping("Banner")
	public ModelAndView loadBanner()
	{
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView loadLinks()
	{
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("Display")
	public ModelAndView loadDisplay()
	{
		ModelAndView mv = new ModelAndView("Display");
		return mv;
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsert()
	{
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
}
