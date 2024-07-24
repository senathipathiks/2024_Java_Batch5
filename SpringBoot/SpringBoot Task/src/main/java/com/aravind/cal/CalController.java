package com.aravind.cal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CalController {

		@RequestMapping("cal")
		public ModelAndView cal() {
			ModelAndView mv = new ModelAndView("Calculator");
			return mv;
			
		}
		
		@GetMapping("cal")
		public ModelAndView doCal(Calculator cal) {
			
			//String action=req.getParameter("button");
			int a = cal.getNum1();
			int b = cal.getNum2();
			System.out.println(a);
			String str ="";
			ModelAndView mv = new ModelAndView("Calculator");
			/*if(action.equals("sum")) {*/
				int c = a+b;
				str += c;
//			}
			
			
			
			mv.addObject("Action",str);
			return mv;
			
		}
		
}
