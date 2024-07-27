package com.coffee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.model.Orders;
import com.coffee.serviceimplementation.OrderSerImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/orders")
public class OrderController {
	OrderSerImpl service;

	public OrderController(OrderSerImpl service) {
		super();
		this.service = service;
	}
	
	String done = "Success";
	String notdone = "Failure";
	
	@PostMapping
	public String addOrder(@RequestBody Orders ord) {
		String msg="";
		try {
			service.addOrder(ord);
			msg = done;
		}
		catch(Exception e) {
			msg= notdone;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Optional<Orders> getOrdById(@PathVariable("id") int id) {
		return service.getOrder(id);
	}
	
	@GetMapping("/all")
	public List<Orders> getAllOrder(){
		return service.viewAllOrder();
	}
	
	@PutMapping
	public String updateOrdById(@RequestBody Orders ord) {
		String msg="";
		try {
			service.updOrd(ord);
			msg = done;
		}
		catch(Exception e) {
			msg = notdone;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public void delOrdById(@PathVariable("id") int id) {
		service.delOrd(id);
	}
}
