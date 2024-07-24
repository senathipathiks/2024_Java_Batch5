package com.velan.restapp.controller;

import java.util.List;

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

import com.velan.restapp.model.Customer;
import com.velan.restapp.serviceimp.CustomerServiceImp;


@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:3000")
public class CustomerController {

	@Autowired
    CustomerServiceImp service;

	static final String SUCESS="Success";
	static final String FAILURE="Failure";
	@PostMapping
	public String insertCustomer(@RequestBody Customer cus) {
		String msg = "";

		try {
			service.addCustomer(cus);
			msg = SUCESS;
		}

		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}

	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {

		return service.getCustomer(id);

	}

	@GetMapping("/all")
	public List<Customer> getCustomer() {

		return service.getAllCustomers();

	}
	
	@PutMapping()
	public String updateCustomer(@RequestBody Customer cus) {
		String msg = "";

		try {
			service.updateCustomer(cus);
			msg = SUCESS;
		}

		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteCustomer(id);
			msg=SUCESS;
		} catch (Exception e) {
			msg=FAILURE;
		}
		return msg;
	}
}
