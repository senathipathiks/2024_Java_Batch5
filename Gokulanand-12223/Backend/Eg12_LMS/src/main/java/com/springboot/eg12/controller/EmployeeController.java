package com.springboot.eg12.controller;

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

import com.springboot.eg12.model.Employee;
import com.springboot.eg12.service.EmployeeServiceImplementation;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController 
{
	EmployeeServiceImplementation service;

	public EmployeeController(EmployeeServiceImplementation service) {
		super();
		this.service = service;
	}

	@PostMapping
	public  String insertEmployee(@RequestBody Employee employee)
	{
	String msg = "";
	try {
	service.addEmployee(employee);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Employee> readAllEmployees()
	{
	return service.getallEmployees();
	}

	@PutMapping
	public  String updateEmployee(@RequestBody Employee employee)
	{
	String msg = "";
	try {
	service.updateEmployee(employee);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{emp_id}")
	public String deleteEmployeebyId(@PathVariable("emp_id") int emp_id)
	{
	String msg = "";
	try {
	service.deleteEmployee(emp_id);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
	
	@GetMapping("{emp_id}")
	public Employee findEmployee(@PathVariable("emp_id") int emp_id)
	{
			return service.findEmployeeById(emp_id);
	}
}
