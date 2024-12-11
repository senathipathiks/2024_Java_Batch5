package com.emppayroll.restapi.controller;

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

import com.emppayroll.restapi.model.Salary;
import com.emppayroll.restapi.service.SalaryPayrollServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000/salary")
@RequestMapping("/payroll")
public class SalaryPayrollController {

	@Autowired
	SalaryPayrollServiceImpl service;
	String success="Success";
	String failure="Failure";
	@PostMapping
	public String insertpayroll (@RequestBody Salary salary) {
		
		String msg="";
		try {
			service.addPayroll(salary);
			msg=success;
		} catch (Exception e) {
			
			msg=failure;
		}
		return msg;
		
		
	}
	
	@GetMapping("{pid}")
	public Salary getpayrollbyId(@PathVariable("pid") int id){
		
		return service.getpayroll(id);
		
	}
	
	@GetMapping("/all")
	public List<Salary > getSalarypay(){
		
		return service.getall();
		
	}
	
	@PutMapping
	public String updatepayroll(@RequestBody Salary salary) {
		
		String msg="";
		try {
			service.updatepayroll(salary);
			msg=success;
		} catch (Exception e) {
			
			msg=failure;
		}
		return msg;
		
		
		
	}
	
	@DeleteMapping("{pid}")
	public String deleteStudentbyID(@PathVariable("pid") int id) {
		
		String msg="";
		try {
			service.deletepayroll(id);
			msg=success;
		} catch (Exception e) {
			
			msg=failure;
		}
		return msg;
	}
	
	
	
}
