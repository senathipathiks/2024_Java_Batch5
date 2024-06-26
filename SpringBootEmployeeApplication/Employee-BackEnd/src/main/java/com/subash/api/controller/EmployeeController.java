package com.subash.api.controller;

import java.util.List;
import java.util.Optional;

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
import com.subash.api.repository.EmployeeRepo;
import com.subash.api.repository.PayrollRepo;
import com.subash.api.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;

	@PostMapping
	public String insertEmployee(@RequestBody Employee stud) {
		String msg = "";

		try {

			System.out.println(stud.getPayroll());
			System.out.println(stud);
			service.addEmployee(stud);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
		 
	        
	}

	@PutMapping
	public String updateEmployee(@RequestBody Employee stud) {
		String msg = "";

		try {

			service.updateEmployee(stud);
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
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}

	@GetMapping("/all")
	public List<Employee> getEmployees() {
		return service.getAllEmployees();
	}

	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deleteEmployee(id);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;

	}
}
