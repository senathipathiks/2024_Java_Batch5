package com.madhan.restapp.controller;

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

import com.madhan.restapp.model.Employee;
import com.madhan.restapp.model.Payroll;
import com.madhan.restapp.serviceimpl.EmployeeServiceImpl;
import com.madhan.restapp.serviceimpl.PayrollServiceImpl;

@RestController
@RequestMapping("/payrolltable")
@CrossOrigin("*")
public class PayrollController {

	@Autowired
	PayrollServiceImpl service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll proll)
	{
		String msg="";
		try {
			service.addPayroll(proll);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id)
	{
	return service.getPayroll(id);
}
	
//	@GetMapping("/getpayrollid")
//	public List<Integer> getPayrollIds() {
//		return service.getPayrollIds();
//	}
	
	
	@GetMapping("/all")
	public List<Payroll> getPayroll()
	{
	return service.getAllPayroll();
}
	
	@PutMapping
	public String updatePayroll(@RequestBody Payroll proll)
	{
		String msg="";
		try {
			service.updatePayroll(proll);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deletePayroll(@PathVariable("id") int  id)
	{
		String msg="";	
		try {
			service.deletePayroll(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
}
