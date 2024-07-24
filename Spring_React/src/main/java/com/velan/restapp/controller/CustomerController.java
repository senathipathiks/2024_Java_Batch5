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
@CrossOrigin("*")
public class CustomerController {

	@Autowired
    CustomerServiceImp service;

	@PostMapping
	public String insertCustomer(@RequestBody Customer cus) {
		String msg = "";

		try {
			service.addCustomer(cus);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
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
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteCustomer(id);
			msg="Sucess";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
