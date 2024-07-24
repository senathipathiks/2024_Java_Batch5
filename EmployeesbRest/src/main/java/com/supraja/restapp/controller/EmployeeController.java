package com.supraja.restapp.controller;

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
import com.supraja.restapp.model.Employee;
import com.supraja.restapp.serviceimpl.EmployeeServiceImpl;


@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController 
{
	@Autowired
  EmployeeServiceImpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee empl)
	{
		String msg="";
		try
		{
			service.addEmployee(empl);
			System.out.println(empl);
			msg="Success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	@GetMapping("{id}")
	public Employee getEmployeebyId(@PathVariable("id")int id)
	{
		return service.getEmployee(id);
	}
	
	@GetMapping("/all")
	public List <Employee>getEmployee()
	{
		return service.getAllEmployee();
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee empl)
	{
		String msg="";
		try
		{
			service.updateEmployee(empl);
			msg="Success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		String msg="";
		try
		{
			service.deleteEmployee(id);
			msg="Success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
}
