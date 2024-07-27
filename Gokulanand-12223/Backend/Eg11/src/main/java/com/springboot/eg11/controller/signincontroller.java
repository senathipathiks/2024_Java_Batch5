package com.springboot.eg11.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.eg11.model.signin;
import com.springboot.eg11.service.signinserviceimplementation;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/signin")
@CrossOrigin("*")
public class signincontroller 
{
	Logger logger = (Logger) LoggerFactory.getLogger(signincontroller.class);
	
	public signincontroller(signinserviceimplementation service) {
		super();
		this.service = service;
	}
	signinserviceimplementation service;
	
	@PostMapping
	public String insertRequest(@RequestBody signin signin) {
		String msg = "";
		try {
			msg = service.addUser(signin);
			logger.trace(signin.getSign_name());
		} catch (Exception e) {
			logger.error(msg);
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("all")
	public List<signin> getUSers() {
		return service.getAllUsers();
	}

}
