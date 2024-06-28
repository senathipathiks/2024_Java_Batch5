package com.gana.backend.controller;

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
import com.gana.backend.model.Employee;
import com.gana.backend.model.PayRoll;
import com.gana.backend.serviceimpl.EmployeeServiceImpl;
import com.gana.backend.serviceimpl.PayRollServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl service;
	@PostMapping
public String insertEmployee(@RequestBody Employee employee ) {
		
		String msg = "";
		try {
			service.addEmployee(employee);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}
	
	@GetMapping("{empid}")
	public Employee getEmployeeById(@PathVariable("empid") int empid) {
	return service.getEmployee(empid);
	}
	
	@GetMapping("/all")
	public List<Employee> getEmployees() {
	return service.getAllEmployees();
	}
	
	@PutMapping
public String updateEmployee(@RequestBody Employee employee ) {
		
		String msg = "";
		try {
			service.updateEmployee(employee);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}
	
	@DeleteMapping("{empid}")
	public String deleteEmployeeById(@PathVariable("empid") int empid) {
		String msg = "";
		try {
			service.deleteEmployee(empid);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}

}
