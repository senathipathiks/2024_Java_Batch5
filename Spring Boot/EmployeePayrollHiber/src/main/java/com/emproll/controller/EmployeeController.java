package com.emproll.controller;

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

import com.emproll.model.Employee;
import com.emproll.service.Eserimpl;

import org.springframework.web.bind.annotation.RequestParam;
 
 
@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	Eserimpl employeeServiceImpli;
	@PostMapping
	public String insertRequest(@RequestBody Employee employee) {
		String msg = "";
		try {
			msg = employeeServiceImpli.addEmployee(employee);
			System.out.println(employee.getEname());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	@PutMapping
	public String updateRequest(@RequestBody Employee employee) {
		String msg = "";
		try {
			msg = employeeServiceImpli.updateEmployee(employee);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	@GetMapping("all")
	public List<Employee> getAdmins() {
		return employeeServiceImpli.getAllEmployees();
	}
	@GetMapping("{id}")
	public Employee getAdminById(@PathVariable("id") int id) {
		return employeeServiceImpli.getEmployee(id);
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployeebyId(@PathVariable("id") int id) {
		String msg="";
		try {
			employeeServiceImpli.deleteEmployee(id);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}