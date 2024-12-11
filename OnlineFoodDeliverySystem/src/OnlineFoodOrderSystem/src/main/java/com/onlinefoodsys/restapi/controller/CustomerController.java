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

import com.onlinefoodsys.restapi.model.Customer;
import com.onlinefoodsys.restapi.service.CustomerServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/customer")
public class CustomerController {
@Autowired
CustomerServiceImpl service;
String success ="Success";
String failure ="Failure";
@PostMapping
public String insertcustomer (@RequestBody Customer customer) {
	
	String msg="";
	try {
		service.adduser(customer);
		msg=success;
	} catch (Exception e) {
				msg=failure;
	}
	return msg;
	
	
}

@GetMapping("{cid}")
public Optional<Customer> getbyId(@PathVariable("cid") int id){
	
	return service.getuser(id);
	
}

@GetMapping("/all")
public List<Customer > getusers(){
	
	return service.getall();
	
}

@PutMapping
public String updateuser(@RequestBody Customer customer) {
	
	String msg="";
	try {
		service.updatecustomer(customer);
		msg=success;
	} catch (Exception e) {
		
		msg=failure;
	}
	return msg;
	
	
	
}

@DeleteMapping("{cid}")
public String deleteStudentbyID(@PathVariable("cid") int id) {
	
	String msg="";
	try {
		service.deletecustomer(id);
		msg=success;
	} catch (Exception e) {
		
		msg=failure;
	}
	return msg;
}

}
