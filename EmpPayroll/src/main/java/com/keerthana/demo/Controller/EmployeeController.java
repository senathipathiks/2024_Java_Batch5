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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.Model.Employee;

import com.keerthana.demo.ServiceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")

public class EmployeeController {

	@Autowired
	EmployeeServiceImpl empservice;
	
	@PostMapping
	public String insertEmpl(@RequestBody Employee emp, @RequestParam int pId) {
		return empservice.addEmpl(emp, pId);
//		String msg="";
//		try {
//			empservice.addEmpl(emp,pId);
//			msg="Success";
//		}catch(Exception e) {
//			e.printStackTrace();
//			msg="Failure";
//		}
//		return msg;
		
	}
	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return empservice.getEmployee(id);
	}
	@GetMapping("/all")
	public List<Employee> getEmployees() {
		return empservice.getAllEmployee();
	}
	@PutMapping("{eid}")
//	public String updationEmployee(@RequestBody Employee emp,@PathVariable int eid,@RequestParam int pId) {
//		return empservice.updateEmployee(emp, eid, pId);
		public String updationEmployee(@RequestBody Employee emp,@PathVariable int eid) {
			return empservice.updateEmployee(emp, eid);
//		String msg="";
//		try {
//			empservice.updateEmployee(emp,eid,pId);
//			msg="Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			msg="Failure";
//		}
//		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteEmployeetById(@PathVariable("id") int id) {
		String msg="";
		try {
			empservice.deleteEmployee(id);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
}
