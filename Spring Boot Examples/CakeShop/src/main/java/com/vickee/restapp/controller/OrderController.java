package com.vickee.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Order;
import com.vickee.restapp.serviceImpl.OrderServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	OrderServiceImpl service;
	
	@PostMapping
	public String insertOrder(@RequestBody Order ord) {
		String msg="";
		try {
			service.addOrder(ord);
			msg="Success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="Failure";
		}
	return msg;
	}
	
}
