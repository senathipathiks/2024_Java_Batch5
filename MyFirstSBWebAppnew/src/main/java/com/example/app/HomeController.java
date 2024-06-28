package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

		@RequestMapping("/")
	public String index()
	{
		return "index";
	}
		
		@RequestMapping("home")
	public String home()
	{
		return "home";
	}
		
		@RequestMapping("login")
	public ModelAndView login()
	{
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("Action",null);

		return mv;
	}
		
		@RequestMapping("register")
	public String register()
	{
		return "register";
	}
		
		@RequestMapping("validate")
		public ModelAndView validate(Login log)
		{
			String uname = log.getUname();
			String pass = log.getPass();
			ModelAndView mv = new ModelAndView("login");

			if((uname.equals("madhan")) && (pass.equals("1234")))
			{
				mv.addObject("Action","Success");
			}
			else
			{
				mv.addObject("Action","Failure");

			}
			return mv;
		}
		
		@RequestMapping("calculator")
		public ModelAndView validate(Calculator calc)
		{
			int n1 = calc.getNum1();
			int n2 = calc.getNum2();
			ModelAndView mv = new ModelAndView("calculator);

			String
			return mv;
		}
}
