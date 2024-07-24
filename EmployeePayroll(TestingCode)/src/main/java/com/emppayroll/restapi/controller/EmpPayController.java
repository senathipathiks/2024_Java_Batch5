package com.emppayroll.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emppayroll.restapi.model.EmpPay;

import com.emppayroll.restapi.service.EmpPayrollService;


@RestController
@CrossOrigin(origins = "http://localhost:3000/employee")
@RequestMapping("/employee")
public class EmpPayController {

	
	EmpPayrollService service;
	
	public EmpPayController(EmpPayrollService service) {
		super();
		this.service = service;
	}

	String success="Success";
	String failure="Failure";
	@PostMapping
	public String insertemp(@RequestBody EmpPay emp) {
		
		String msg="";
		try {
			service.addemp(emp);
			msg=success;
		} catch (Exception e) {
			
			msg=failure;
		}
		return msg;
		
		
		
	}
	
	@GetMapping("{id}")
	public EmpPay getempbyId(@PathVariable("id") int id){
		
		return service.getemp(id);
		
	}
	
	@GetMapping("/all")
	public List<EmpPay > getemp(){
		
		return service.getall();
		
	}
	
	
	@PutMapping
	public String updateemp(@RequestBody EmpPay emp) {
		
		String msg="";
		try {
			service.updateemp(emp);
			msg=success;
		} catch (Exception e) {
			
			msg=failure;
		}
		return msg;
		
		
		
	}
	
	@DeleteMapping("{id}")
	public String deleteempbyID(@PathVariable("id") int id) {
		
		String msg="";
		try {
			service.deleteemp(id);
			msg=success;
		} catch (Exception e) {
			msg=failure;
		}
		return msg;
	}
	
	
}
