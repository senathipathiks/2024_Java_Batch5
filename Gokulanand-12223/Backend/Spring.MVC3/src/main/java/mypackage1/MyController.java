package mypackage1;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	/*
	 * @PostMapping("login") public String doLogin(HttpServletRequest req, Model m)
	 * { String uname = req.getParameter("name"); String pass =
	 * req.getParameter("pwd"); m.addAttribute("uname", uname);
	 * m.addAttribute("pwd", pass); return "LoginSuccess"; }
	 */
	
	@RequestMapping("login")
	public ModelAndView doLogin(@ModelAttribute("bean")User userobj) {
		
		ModelAndView mv = new ModelAndView("LoginSuccess");
		System.out.println(userobj);
		mv.addObject("bean",userobj);
		return mv;
	}
}
