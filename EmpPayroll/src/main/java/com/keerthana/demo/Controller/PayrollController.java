package com.keerthana.demo.Controller;

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


import com.keerthana.demo.Model.Payroll;
import com.keerthana.demo.ServiceImpl.PayrollServiceImpl;

@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController {

	@Autowired
	PayrollServiceImpl payservice;
	
	@PostMapping
	public String insertEmpl(@RequestBody Payroll pay) {
		String msg="";
		try {
			payservice.addPay(pay);
			msg="Success";
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
		
	}
	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id) {
		return payservice.getPayroll(id);
	}
	@GetMapping("/all")
	public List<Payroll> getPayrolls() {
		return payservice.getAllPayroll();
	}
	@PutMapping
	public String updationPayroll(@RequestBody Payroll pay) {
		String msg="";
		try {
			payservice.updatePayroll(pay);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msg="";
		try {
			payservice.deletePayroll(id);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
}
