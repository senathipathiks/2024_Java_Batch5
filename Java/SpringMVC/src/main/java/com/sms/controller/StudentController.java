package com.sms.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ComponentScan(basePackages= {"com.ems.controller","com.ems.dao"})
public class StudentController {

	@GetMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv  = new ModelAndView("Banner");
		return mv;
	}
	
	@GetMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	
	
}
