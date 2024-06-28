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

import com.emproll.model.Employee;
import com.emproll.service.Eserimpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	
	String done = "Success";
	String notdone = "Failure";
	
	public EmployeeController(Eserimpl service) {
		super();
		this.service = service;
	}

	Eserimpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee emp) {
		String msg="";
		try {
			service.addemp(emp);
			msg = done;
		}
		catch(Exception e) {
			msg= notdone;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Optional<Employee> getEmpbyid(@PathVariable("id") int id) {
		return service.getEmp(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getallemp(){
		return service.viewAllEmp();
	}
	
	@PutMapping
	public String updateEmpbyid(@RequestBody Employee emp) {
		String msg="";
		try {
			service.upEmp(emp);
			msg = done;
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = notdone;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public void delempbyid(@PathVariable("id") int id) {
		service.delEmp(id);
	}
}
