package mywebapp3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
//	@RequestMapping("login")	
//	public String doLogin(HttpServletRequest req, Model m) {
//		System.out.println("Inside Controller");
//		String uname = req.getParameter("name");
//		String pwd = req.getParameter("pwd");
//		m.addAttribute("uname",uname);
//		m.addAttribute("pwd", pwd);
//		return "Login";
//		
//	}
	
	
//	@RequestMapping("login")
//	public String doLogin(@RequestParam("name") String uname, @RequestParam("pwd") String pwd, Model m) {
//		System.out.println("Inside Controller");
//		m.addAttribute("uname",uname);
//		m.addAttribute("pwd", pwd);
//		return "Login";
//		
//	}
	
	@RequestMapping("login")
	public ModelAndView doLogin(@ModelAttribute("bean")User user1) {
		ModelAndView mv = new ModelAndView("Login");
		System.out.println("entered");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
		
	}
	
	
	
	
	

}
