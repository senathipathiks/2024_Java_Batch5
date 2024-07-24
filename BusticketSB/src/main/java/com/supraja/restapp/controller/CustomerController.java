package com.supraja.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supraja.restapp.model.Customer;
import com.supraja.restapp.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

	public CustomerController(CustomerServiceImpl service) {
		super();
		this.service = service;
	}

	CustomerServiceImpl service;

	@PostMapping
	public String insertCustomer(@RequestBody Customer cust) {
		String msg = "";
		try {
			service.addCustomer(cust);
			msg = "Successfully added";
		} catch (Exception e) {
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Customer getCustomerbyId(@PathVariable("id") int id) {
		return service.getCustomer(id);
	}

	@GetMapping("/all")
	public List<Customer> getCustomer() {
		return service.getAllCustomer();
	}

	@PutMapping
	public String updateCustomer(@RequestBody Customer cust) {
		String msg = "";
		try {
			service.updateCustomer(cust);
			msg = "Updated Success";
		} catch (Exception e) {
			msg = "Updated Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteCustomer(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteCustomer(id);
			msg = "Deleted Successfully";
		} catch (Exception e) {
			msg = "Deletion Failure";
		}

		return msg;
	}
}
