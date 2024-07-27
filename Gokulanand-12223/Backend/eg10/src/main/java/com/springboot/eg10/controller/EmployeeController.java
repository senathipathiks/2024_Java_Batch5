package com.springboot.eg10.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.eg10.model.Employee;
import com.springboot.eg10.service.EmployeeServiceImplementation;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/employee")
@CrossOrigin("origin=http://localhost:3000")
public class EmployeeController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(EmployeeController.class);
	
	
	public EmployeeController(EmployeeServiceImplementation employeeServiceImpli) {
		super();
		this.employeeServiceImpli = employeeServiceImpli;
	}

	EmployeeServiceImplementation employeeServiceImpli;
	
	@PostMapping
	public String insertRequest(@RequestBody Employee employee) {
		String msg = "";
		try {
			msg = employeeServiceImpli.addEmployee(employee);
			logger.trace(employee.getName());
		} catch (Exception e) {
			logger.error(msg);
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("all")
	public List<Employee> getAdmins() {
		return employeeServiceImpli.getAllEmployees();
	}
	
	@PutMapping
	public String updateRequest(@RequestBody Employee employee) {
		String msg = "";
		try {
			msg = employeeServiceImpli.updateEmployee(employee);
		} catch (Exception e) {
			logger.error(msg);
			msg = "Failer";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		String msg="";
		try {
			employeeServiceImpli.deleteEmployee(id);
			msg="Success";
		}
		catch(Exception e) {	
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Employee findEmployeeById(@PathVariable("id") int id) {
		return employeeServiceImpli.getEmployee(id);
	}

}
