package com.supraja.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supraja.restapp.model.LoginReg;
import com.supraja.restapp.service.LoginRegService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class LoginRegController 
{
  @Autowired
  LoginRegService loginregService;
  
  @PostMapping("/register")
  public String register(@RequestBody LoginReg loginreg) {
      LoginReg existingUser = loginregService.findByUsername(loginreg.getUsername());
      if (existingUser != null) {
          return "username already exists";
      }
      loginregService.saveLoginReg(loginreg);
      return "User registered successfully";
  }
  
  @PostMapping("/login")
  public String login(@RequestBody LoginReg loginreg) {
      LoginReg existingUser = loginregService.findByUsername(loginreg.getUsername());
      if (existingUser != null && loginreg.getPassword().equals( existingUser.getPassword())) {
          return "Login successful";
      } else {
          return "Invalid credentials";
      }
  }
}

