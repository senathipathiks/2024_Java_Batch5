package mypackage1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("register")
	public String doRegister()
	{
		return "Registration";
	}
	
	@RequestMapping("login")
	public String doLogin()
	{
		return "Login";
	}
}
