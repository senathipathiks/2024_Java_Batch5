package com.SpringBoot.Eg7.Controller;

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

import com.SpringBoot.Eg7.Model.Employee;
import com.SpringBoot.Eg7.Service.EmployeeServiceImplementation;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController 
{
	@Autowired
	EmployeeServiceImplementation service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee employee)
	{
		String msg = "";
		try {
			service.addEmployee(employee);
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("{eid}")
	public Employee readEmployee(@PathVariable("eid") int eid)
	{
		return service.getEmployee(eid);		
	}
	
	@GetMapping("/all")
	public List<Employee> readAllEmployee()
	{
		return service.getallEmployee();
	}
	
	@PutMapping
	public  String updateEmployee(@RequestBody Employee employee)
	{
		String msg = "";
		try {
			service.updateEmployee(employee);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{eid}")
	public String deleteEmployeeById(@PathVariable("eid") int eid)
	{
		String msg = "";
		try {
			service.deleteEmployee(eid);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
