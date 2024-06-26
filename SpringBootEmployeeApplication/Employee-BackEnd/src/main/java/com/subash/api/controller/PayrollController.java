package com.subash.api.controller;

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

import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;
import com.subash.api.serviceImpl.EmployeeServiceImpl;
import com.subash.api.serviceImpl.PayrollServiceImpl;

@RestController
@RequestMapping("/payroll")
@CrossOrigin("*")
public class PayrollController {

	@Autowired
	PayrollServiceImpl service; 

	@PostMapping
	public String insertPayroll(@RequestBody Payroll stud) {
		String msg = "";

		try {

			service.addPayroll(stud);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
	}

	@PutMapping
	public String updatePayroll(@RequestBody Payroll stud) {
		String msg = "";

		try {

			service.updatePayroll(stud);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
	}
//	@PostMapping
//	public String insertStudents(@RequestBody List<Student> stud) {
//		String msg = "";
//		
//		try {
//			
//			service.addStudents(stud);
//			msg = "Success";
//			
//		}catch (Exception e) {
//			msg = "failure";
//		}
//		return msg;
//	}

	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id) {
		return service.getPayroll(id);
	}

	@GetMapping("/all")
	public List<Payroll> getPayrolls() {
		return service.getAllPayrolls();
	}

	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deletePayroll(id);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;

	}
}
