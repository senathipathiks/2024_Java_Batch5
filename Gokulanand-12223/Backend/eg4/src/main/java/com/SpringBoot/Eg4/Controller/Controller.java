package com.SpringBoot.Eg4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller 
{
	
	@GetMapping("Header")
	public ModelAndView loadIndex()
	{
		ModelAndView mv = new ModelAndView("Header");
		mv.addObject("Action", null);
		return mv;
	}
	
	@GetMapping("Body")
	public ModelAndView loadBody()
	{
		ModelAndView mv = new ModelAndView("Body");
		mv.addObject("Action", null);
		return mv;		
	}
	
	@GetMapping("Buttons")
	public ModelAndView loadButtons()
	{
		ModelAndView mv = new ModelAndView("Buttons");
		mv.addObject("Action", null);
		return mv;		
	}
	
	@GetMapping("Insert")
	public ModelAndView loadInsert()
	{
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", null);
		return mv;		
	}

}
