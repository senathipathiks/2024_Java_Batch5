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

import com.velan.restapp.model.Employee;
import com.velan.restapp.model.Payroll;
import com.velan.restapp.serviceimp.EmployeeServiceImp;


@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
    EmployeeServiceImp service;

	@PostMapping
	public String insertEmployee(@RequestBody Employee emp) {
		String msg = "";

		try {
			service.addEmployee(emp);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {

		return service.getEmployee(id);

	}

	@GetMapping("/all")
	public List<Employee> getEmployee() {

		return service.getAllEmployee();

	}
	
	@PutMapping()
	public String updateEmployee(@RequestBody Employee emp) {
		String msg = "";

		try {
			service.updateEmployee(emp);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteEmployee(id);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	
}
