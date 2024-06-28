package com.prabha.restapp.controller;

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

import com.prabha.restapp.model.Employee;
import com.prabha.restapp.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	EmployeeServiceImpl serv;
	
	
	public EmployeeController(EmployeeServiceImpl serv) {
		super();
		this.serv = serv;
	}

	@PostMapping
	public String insertEmployee(@RequestBody Employee emp)
	{
		String msg="";
		try {
			serv.addEmployee(emp);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}

	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
	return serv.getEmployee(id);
	}
	
	
	@GetMapping("/all")
	public List<Employee> getEmployees() {
	return serv.getAllEmployees();
	}
	
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {
		String msg="";
		try {
			serv.updateEmployee(emp);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		String msg="";
		try {
			serv.deleteEmployee(id);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}
	
	
	

}
