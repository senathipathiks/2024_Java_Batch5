package com.gopi.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalController {

	
	
	@RequestMapping("")
	public ModelAndView index() {
		
		ModelAndView mv  = new ModelAndView("Cal");
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("cal")
	public ModelAndView Addition(@RequestParam("num1") int a,@RequestParam("num2") int b,@RequestParam("but") String button) {
		ModelAndView mv  = new ModelAndView("Cal");
		int sum=0;
		if(button.equals("add")) {
			sum=a+b;
		}
		else if (button.equals("sub")) {
			sum=a-b;
		}
		else if (button.equals("mul")) {
			sum=a*b;
		}
		else if (button.equals("div")) {
			if(b==0) {
				mv.addObject("Action","Input 2 should not be ZERO");
				return mv;
			}
			else {
				sum=a/b;
			}
		}
		String sums = String.valueOf(sum);
			mv.addObject("Action",sums);
		return mv;
	}
}
