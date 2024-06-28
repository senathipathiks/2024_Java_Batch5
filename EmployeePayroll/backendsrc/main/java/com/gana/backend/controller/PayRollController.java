package com.gana.backend.controller;

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

import com.gana.backend.model.PayRoll;
import com.gana.backend.serviceimpl.PayRollServiceImpl;

@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayRollController {
	
	@Autowired
	PayRollServiceImpl service;
	@PostMapping
	public String insertPayRoll(@RequestBody PayRoll payroll ) {
		
		String msg = "";
		try {
			service.addPayRoll(payroll);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}
	
	@GetMapping("{payrollid}")
	public PayRoll getPayRollById(@PathVariable("payrollid") int payrollid) {
	return service.getPayRoll(payrollid);
	}
	
	
	@GetMapping("/all")
	public List<PayRoll> getPayRolls() {
	return service.getAllPayRolls();
	}
	
	@PutMapping
public String updatePayRoll(@RequestBody PayRoll payroll ) {
		
		String msg = "";
		try {
			service.updatePayRoll(payroll);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}
	
	
	
	@DeleteMapping("{payrollid}")
	public String deletePayRollById(@PathVariable("payrollid") int payrollid) {
		String msg = "";
		try {
			service.deletePayRoll(payrollid);
			msg =  "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
			
		}
		return msg;
	}


}
