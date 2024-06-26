package com.ani.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ani.emp.model.Payroll;
import com.ani.emp.serviceImpl.PayrollServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController {

	@Autowired
	PayrollServiceImpl service;

	@PostMapping
	public String insertPayroll(@RequestBody Payroll pay) {
		String msg = "";
		try {
			service.addPayroll(pay);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}
	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id)
	{
		return service.getPayroll(id);
	}
	@GetMapping("/all")
	public List<Payroll> getPayrolls()
	{
		return service.getAllPayrolls();
	}

	@PutMapping
	public String updatePayroll(@RequestBody Payroll pro) {
		String msg = "";
		try {
			service.updatePayroll(pro);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deletePayroll(id);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

}
