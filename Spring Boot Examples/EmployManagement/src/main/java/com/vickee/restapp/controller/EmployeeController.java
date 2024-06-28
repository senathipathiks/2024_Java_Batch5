package com.vickee.restapp.controller;

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

import com.vickee.restapp.model.Employee;
import com.vickee.restapp.serviceimpl.EmployServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployServiceImpl service;
	
	@PostMapping
	public void addEmployee(@RequestBody Employee employee)
	{
		service.addEmployee(employee);
	}
	
	@GetMapping("{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee)
	{
		service.updateEmployee(employee);
	}
}
