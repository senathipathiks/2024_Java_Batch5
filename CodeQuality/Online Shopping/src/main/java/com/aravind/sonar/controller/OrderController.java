package com.aravind.sonar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.sonar.model.Order;
import com.aravind.sonar.serviceimpl.OrderServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:3000")
public class OrderController {

	OrderServiceImpl service;

	public OrderController(OrderServiceImpl service) {
		super();
		this.service = service;
	}

	public OrderServiceImpl getService() {
		return service;
	}

	public void setService(OrderServiceImpl service) {
		this.service = service;
	}

	static final String SUCCESS = "Success";
	static final String FAILURE = "Failure";

	@PostMapping
	public String insertOrder(@RequestBody Order order) {

		String msg = "";

		try {
			service.addOrder(order);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

	@GetMapping("{oid}")
	public Order getOrderById(@PathVariable("oid") int id) {

		return service.getOrder(id);
	}

	@GetMapping("/all")
	public List<Order> getOrders() {

		return service.getAllOrder();
	}

	@PutMapping
	public String updateOrder(@RequestBody Order order) {
		String msg = "";

		try {
			service.updateOrder(order);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

	@GetMapping("/idlist")
	public List<Integer> getIdList() {

		return service.getIdList();
	}

	@DeleteMapping("{oid}")
	public String deleteOrderById(@PathVariable("oid") int id) {
		String msg = "";

		try {
			service.deleteOrder(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;

	}

}
