package mywebapp3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("bean")User user1)
	{
		ModelAndView mv = new ModelAndView("LoginSuccess");
		System.out.println(user1);
		mv.addObject("bean",user1);
		return mv;
	}

}
