package com.emproll.controller;

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

import com.emproll.model.Employee;
import com.emproll.service.Eserimpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	Eserimpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee emp) {
		String msg="";
		try {
			service.addemp(emp);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Employee getEmpbyid(@PathVariable("id") int id) {
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
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public void delempbyid(@PathVariable("id") int id) {
		service.delEmp(id);
	}
}
