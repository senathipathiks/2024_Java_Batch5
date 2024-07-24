package com.madhan.restapp.controller;

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

import com.madhan.restapp.model.Customer;
import com.madhan.restapp.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost://3000")
public class CustomerController {

			@Autowired
			CustomerServiceImpl service;
			
			@PostMapping
			public String insertCustomer(@RequestBody Customer cust)
			{
				String msg="";
				try {
					service.addCustomer(cust);
					msg="Success";
				} 
				
				catch(Exception e) {
					
					msg="Failure";
				}
				
				return msg;
			}
			@GetMapping("{id}")
			public Customer getCustomerById(@PathVariable("id") int id)
			{
			return service.getCustomer(id);
		}
			
			@GetMapping("/all")
			public List<Customer> getCustomer()
			{
			return service.getAllCustomer();
		}
			
			@PutMapping
			public String updateCustomer(@RequestBody Customer cust)
			{
				String msg="";
				try {
					service.updateCustomer(cust);
					msg="Success done";
				} 
				
				catch(Exception e) {
					msg="Failure done";
				}
				
				return msg;
			}
			
			
			
			@DeleteMapping("{id}")
			public String deleteCustomer(@PathVariable("id") int  id)
			{
				String msg="";
				try {
					service.deleteCustomer(id);
					msg="Success operated";
				} 
				
				catch(Exception e) {
					msg="Failure operated";
				}
				
				return msg;
			}
			
			

	}

	

