package com.aravind.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.micro.model.Employee;
import com.aravind.micro.serviceimpl.EmployeeServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		String msg = "";
		
		try {
			service.addEmployee(emp);
			msg = "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		
		return msg;
	}
	
	@GetMapping("{eid}")
	public Employee getEmployeeById(@PathVariable("eid") int id) {
		
		return service.getEmployee(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getEmployees() {
		
		return service.getAllEmployee();
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {
	String msg = "";
	
	try {
		service.updateEmployee(emp);
		msg = "Success";
	}
	catch(Exception e) {
		e.printStackTrace();
		msg = "Failure";
	}
	
	return msg;
}
	
	@DeleteMapping("{eid}")
	public String deleteEmployeeById(@PathVariable("eid") int id) {
		String msg = "";
		
		try {
			service.deleteEmployee(id);
			msg = "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		
		return msg;
		
	}
	

}
