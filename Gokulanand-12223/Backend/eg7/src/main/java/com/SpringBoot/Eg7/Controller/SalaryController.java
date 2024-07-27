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

import com.SpringBoot.Eg7.Model.Salary;
import com.SpringBoot.Eg7.Service.SalaryServiceImplementation;

@RestController
@RequestMapping("/salary")
@CrossOrigin("*")
public class SalaryController 
{
	@Autowired
	SalaryServiceImplementation service;
	
	@PostMapping
	public  String insertEmployee(@RequestBody Salary salary)
	{
		String msg = "";
		try {
			service.addSalary(salary);
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("{salid}")
	public Salary readSalary(@PathVariable("salid") int salid)
	{
		return service.getSalary(salid);		
	}
	
	@GetMapping("/all")
	public List<Salary> readAllSalary()
	{
		return service.getallSalary();
	}
	
	@PutMapping
	public  String updateSalary(@RequestBody Salary salary)
	{
		String msg = "";
		try {
			service.updateSalary(salary);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{salid}")
	public String deleteSalarybyId(@PathVariable("salid") int salid)
	{
		String msg = "";
		try {
			service.deleteSalary(salid);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
