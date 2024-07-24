package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Payroll;
import com.vickee.restapp.serviceimpl.PayrollServiceImpl;

@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController {
	
	@Autowired
	PayrollServiceImpl service;
	
	@PostMapping
	public void addPayroll(@RequestBody Payroll payroll) {
		service.addPayroll(payroll);
	}
	@GetMapping("{id}")
	public Payroll getPayroll(@PathVariable int id)
	{
		return service.getPayroll(id);
	}
	@GetMapping("/allpayrolls")
	public List<Payroll> getAllPayrolls()
	{
		return service.getAllPayrolls();
	}
	@PutMapping
	public void updatePayroll(@RequestBody Payroll payroll)
	{
		service.updatePayroll(payroll);
	}
	@GetMapping("/pidList")
	public List<Integer> getAllPids()
	{
		return service.getAllPids();
	}
}
