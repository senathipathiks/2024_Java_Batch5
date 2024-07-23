package com.emproll.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emproll.model.Payroll;
import com.emproll.service.Pserimpl;

@RestController
@RequestMapping("/payroll")
@CrossOrigin(origins = "http://localhost:3000")
public class PayrollController {
	
	String done = "Success";
	String notdone = "Failure";
	
	public PayrollController(Pserimpl service) {
		super();
		this.service = service;
	}

	Pserimpl service;
	
	@PostMapping
	public String insertPayoll(@RequestBody Payroll roll) {
		String msg="";
		try {
			service.addPay(roll);
			msg = done;
		}
		catch(Exception e){
			msg = notdone;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Optional<Payroll> getPaybyid(@PathVariable("id") int id) {
		return service.getPay(id);
	}
	
	@GetMapping("/all")
	public List<Payroll> getallpay(){
		return service.viewAllPay();
	}
	
	@PutMapping
	public String updatePaybyid(@RequestBody Payroll pay) {
		String msg="";
		try {
			service.upPay(pay);
			msg="Success";
		}
		catch(Exception e) {
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public void delpaybyid(@PathVariable("id") int id) {
		service.delPay(id);
	}
}
