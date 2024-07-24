package com.employeepayroll.application.controller;

import org.springframework.web.bind.annotation.*;
import com.employeepayroll.application.service.PayrollService;
import com.employeepayroll.application.model.Payroll;

import java.util.List;

@CrossOrigin("http://localhost:3001,http://localhost:3000")
@RestController
@RequestMapping("/payroll")
public class PayrollController {

	private final PayrollService payrollService;

	public PayrollController(PayrollService payrollService) {
		this.payrollService = payrollService;
	}

	@GetMapping("/all")
	public List<Payroll> getAllPayrolls() {
		return payrollService.getAllPayrolls();

	}

	@GetMapping("/{id}")
	public Payroll getPayrollById(@PathVariable int id) {
		return payrollService.getPayrollById(id);
	}

	@PostMapping
	public void addPayroll(@RequestBody Payroll payroll) {
		payrollService.savePayroll(payroll);
	}

	@PutMapping("/{id}")
	public void updatePayroll(@PathVariable int id, @RequestBody Payroll payroll) {
		payrollService.updatePayroll(id, payroll);
	}

	@DeleteMapping("/{id}")
	public void deletePayroll(@PathVariable("id") int id) {
		payrollService.deletePayroll(id);
	}
}
