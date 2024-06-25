package com.example.demo;


import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
 
@Controller
public class HomeController {
 
	@RequestMapping("/")
	public String index() {
		return("Calc");
	}	
	@RequestMapping("Calc")
	public String calc() {
		return("Calc");
	}	

	@PostMapping("Calculate")
	public ModelAndView calculate(@ModelAttribute("bean")Calc c, @RequestParam("but") String button){
		//TODO: process POST request
		ModelAndView mv = new ModelAndView("Calc");
		int n1=c.getNum1();
		int n2=c.getNum2();
		String result="";
		if(button.equals("Add"))
		{
			int res= n1+n2;
			result+=res;
			mv.addObject("Action",result);
			System.out.println(mv);
		}
		if(button.equals("Sub"))
		{
			int res= n1-n2;
			result+=res;
			mv.addObject("Action",result);
			System.out.println(mv);
 
			
		}
		if(button.equals("Mul"))
		{
			int res= n1*n2;
			result+=res;
			mv.addObject("Action",result);
			System.out.println(mv);
 
			
		}
		if(button.equals("Div"))
		{
			int res= n1/n2;
			result+=res;
			mv.addObject("Action",result);
			System.out.println(mv);
 
			
		}
		return mv;
	}
}
