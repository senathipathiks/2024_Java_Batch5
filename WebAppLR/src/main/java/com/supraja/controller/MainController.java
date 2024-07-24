package com.supraja.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{
  @RequestMapping("Register")
  public String regMessage()
  {
	  System.out.println("Registered...");
	  return "Register";
  }
  @RequestMapping("Login")
  public String logMessage()
  {
	  System.out.println("Logged in...");
	  return "Login";
  }
}
