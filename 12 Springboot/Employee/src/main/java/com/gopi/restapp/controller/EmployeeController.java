package com.gopi.restapp.controller;

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

import com.gopi.restapp.model.Employee;
import com.gopi.restapp.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee emp) {
		String msgString = "";
		
		try {
			service.addEmployee(emp);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;
	}
	
	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getEmployee() {
		return service.getAllEmployees();
	}
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {
		String msgString = "";
		
		try {
			service.updateEmployee(emp);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;
	}
	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteEmployee(id);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;	
	}
}
