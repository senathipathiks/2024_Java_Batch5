package com.gana.SpringBootCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
	@RequestMapping("")
	public String calculator() {
		return "calculator";
	}
	@RequestMapping("Calculator")
	public ModelAndView Calculator(@RequestParam("num")int a,@RequestParam("num")int b,@RequestParam("button")String button) {
		
		ModelAndView mv = new ModelAndView("calculator");
		int n = 0;
		
		if(button.equals("add"))
		{
			n = a + b;
		}
		else if(button.equals("sub"))
		{
			n = a - b;
		}
		else if(button.equals("mul"))
		{
			n = a * b;
		}
		else if(button.equals("div"))
		{
			if(b == 0) {
				mv.addObject("Action","Invalid");
				return mv;
				
			}
			else {
				n = a / b;
			}
		}
		String ns = String.valueOf("n");
		mv.addObject("Action","Success");
		return mv;
	}
}