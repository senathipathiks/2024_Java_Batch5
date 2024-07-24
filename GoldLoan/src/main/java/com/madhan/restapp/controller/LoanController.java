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

import com.madhan.restapp.model.Loan;
import com.madhan.restapp.serviceimpl.LoanServiceImpl;

@RestController
@RequestMapping("/loantable")
@CrossOrigin("http://localhost://3000")
public class LoanController {

	@Autowired
	LoanServiceImpl service;
	
	@PostMapping
	public String insertLoan(@RequestBody Loan loan)
	{
		String msg="";
		try {
			service.addLoan(loan);
			msg="Success ";
		} 
		
		catch(Exception e) {
			msg="Failure";
		}
		
		return msg;
	}
	@GetMapping("{id}")
	public Loan getLoanById(@PathVariable("id") int id)
	{
	return service.getLoan(id);
}
	

	
	@GetMapping("/all")
	public List<Loan> getLoan()
	{
	return service.getAllLoan();
}
	
	@PutMapping
	public String updateLoan(@RequestBody Loan loan)
	{
		String msg="";
		try {
			service.updateLoan(loan);
			msg="Success done";
		} 
		
		catch(Exception e) {
			msg="Failure done";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteLoan(@PathVariable("id") int  id)
	{
		String msg="";	
		try {
			service.deleteLoan(id);
			msg="Success verified";
		} 
		
		catch(Exception e) {
			msg="Failure verified";
		}
		
		return msg;
	}
}


