package com.onlinefoodsys.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onlinefoodsys.restapi.model.Order;
import com.onlinefoodsys.restapi.service.OrderServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/order")
public class OrderController {
@Autowired

OrderServiceImpl service;

String success ="Success";
String failure ="Failure";
@PostMapping
public String addorder(@RequestBody Order ord) {
	
	String msg="";
	try {
		service.addorder(ord);
		msg=success;
	} catch (Exception e) {
		
		msg=failure;
	}
	return msg;
}

@GetMapping("{id}")
public Optional<Order> getOrderId(@PathVariable("id") int id){
	
	return service.getorder(id);
	
}

@GetMapping("/all")
public List<Order > getorders(){
	
	return service.getall();
	
}


@PutMapping
public String updateorder(@RequestBody Order ord) {
	
	String msg="";
	try {
		service.updateorder(ord);
		msg=success;
	} catch (Exception e) {
		
		msg=failure;
	}
	return msg;
	
	
	
}

@DeleteMapping("{id}")
public String deleteorderbyID(@PathVariable("id") int id) {
	
	String msg="";
	try {
		service.deleteorder(id);
		msg=success;
	} catch (Exception e) {
		
		msg=failure;
	}
	return msg;
}



}
