package com.prabha.restapp.controller;

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

import com.prabha.restapp.model.Payroll;
import com.prabha.restapp.serviceimpl.PayrollServiceImpl;
@RestController
@RequestMapping("/Payroll_hibernate")
@CrossOrigin("*")

public class PayrollController {
	PayrollServiceImpl serv;
	
	
	public PayrollController(PayrollServiceImpl serv) {
		super();
		this.serv = serv;
	}

	@PostMapping
	public String insertPayroll(@RequestBody Payroll payroll)
	{
		String msg="";
		try {
			serv.addPayroll(payroll);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}

	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id) {
	return serv.getPayroll(id);
	}
	
	
	@GetMapping("/all")
	public List<Payroll> getPayrolls() {
	return serv.getAllPayrolls();
	}
	
	
	@PutMapping
	public String updatePayroll(@RequestBody Payroll payroll) {
		String msg="";
		try {
			serv.updatePayroll(payroll);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}
	
	
	
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msg="";
		try {
			serv.deletePayroll(id);
			msg="success";
		}
		catch(Exception e){
			e.printStackTrace();
			msg="failure";
		}
		return msg;
		
	}
}
	
