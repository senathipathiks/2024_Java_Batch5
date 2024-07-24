package com.aravind.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.micro.model.Payroll;
import com.aravind.micro.serviceimpl.PayrollServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pay")
@CrossOrigin("*")
public class PayrollController {
	
	@Autowired
	PayrollServiceImpl service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll pay) {
		System.out.println(pay);
		String msg = "";
		
		try {
			service.addPayroll(pay);
			msg = "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		
		return msg;
	}
	
	@GetMapping("{pid}")
	public Payroll getPayrollById(@PathVariable("pid") int id) {
		
		return service.getPayroll(id);
	}
	
	@GetMapping("/all")
	public List<Payroll> getPayrolls() {
		
		return service.getAllPayroll();
	}
	
	@PutMapping
	public String updatePayroll(@RequestBody Payroll pay) {
	String msg = "";
	
	try {
		service.updatePayroll(pay);
		msg = "Success";
	}
	catch(Exception e) {
		e.printStackTrace();
		msg = "Failure";
	}
	
	return msg;
}
	@GetMapping("/idlist")
	public List<Integer> getIdList() {
		
		return service.getAllId();
	}
	
	@DeleteMapping("{pid}")
	public String deletePayrollById(@PathVariable("pid") int id) {
		String msg = "";
		
		try {
			service.deletePayroll(id);
			msg = "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		
		return msg;
		
	}
	

}
