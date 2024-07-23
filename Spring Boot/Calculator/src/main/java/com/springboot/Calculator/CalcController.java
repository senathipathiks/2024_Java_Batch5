package com.springboot.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
	
	@RequestMapping("/")
	public String index() {
		return "Calchome";
	}
	
	@RequestMapping("Calcform")
	public String docal() {
		return "Calcform";
	}
	
	@PostMapping("docal")
	public ModelAndView docal(@RequestParam("but") String button,@RequestParam("first") int n1, @RequestParam("second") int n2) {
		
		ModelAndView mv = new ModelAndView("Calcform");
		int ans = 0;
		
		if(button.equals("Add")) {
			ans = n1 + n2;
		}
		if(button.equals("Sub")) {
			ans = n1 - n2;
		}
		if(button.equals("Mul")) {
			ans = n1 * n2;
		}
		if(button.equals("Div")) {
			if(n2 == 0) {
				mv.addObject("Action", "Fail");
				return mv;
				}
			else {
				ans = n1 / n2;
			}
		}
		mv.addObject("Action","Success");
		mv.addObject("Result",""+ans);
		return mv;
	}
}
