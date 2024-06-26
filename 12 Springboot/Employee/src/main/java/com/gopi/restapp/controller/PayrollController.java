package com.gopi.restapp.controller;

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

import com.gopi.restapp.model.Payroll;
import com.gopi.restapp.serviceimpl.PayrollServiceImpl;


@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController {
	@Autowired
	PayrollServiceImpl service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll payroll) {
		String msgString = "";
		
		try {
			service.addPayroll(payroll);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;
	}
	
	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id) {
		return service.getPayroll(id);
	}
	@GetMapping("/all")
	public List<Payroll> getPayroll() {
		return service.getAllPayrolls();
	}
	@PutMapping
	public String updatePayroll(@RequestBody Payroll payroll) {
		String msgString = "";
		
		try {
			service.updatePayroll(payroll);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;
	}
	@GetMapping("/getpayrollid")
	public List<Integer> getPayrollIds() {
		return service.getPayrollIds();
	}
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deletePayroll(id);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;	
	}
	
}
