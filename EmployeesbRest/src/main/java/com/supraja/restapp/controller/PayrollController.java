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

import com.supraja.restapp.model.Payroll;
import com.supraja.restapp.serviceimpl.PayrollServiceImpl;



@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController 
{
	@Autowired
  PayrollServiceImpl service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll pay)
	{
		String msg="";
		try
		{
			service.addPayroll(pay);
			System.out.println(pay);
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
	public Payroll getPayrollbyId(@PathVariable("id")int id)
	{
		return service.getPayroll(id);
	}
	
	@GetMapping("/all")
	public List <Payroll>getPayroll()
	{
		return service.getAllPayroll();
	}
	
	@PutMapping
	public String updatePayroll(@RequestBody Payroll pay)
	{
		String msg="";
		try
		{
			service.updatePayroll(pay);
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
	public String deletePayroll(@PathVariable int id)
	{
		String msg="";
		try
		{
			service.deletePayroll(id);
			msg="Success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIDList(){
		return service.getAllId();
	}
}
