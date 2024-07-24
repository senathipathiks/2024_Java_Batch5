package com.rest.MyRest.controller;

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

import com.rest.MyRest.model.Student;
import com.rest.MyRest.serviceimpl.StudentServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServiceImpl service;
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		
		String msg="";
		try {
			service.addStudent(stud);
			msg="Success";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		
		return service.getStudent(id);
	}
	
	@GetMapping("/all")
	public List<Student> getStudents() {
		
		return service.getAllStudents();
	}
	
	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		
		String msg="";
		try {
			service.updateStudent(stud);
			msg="Success";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		
		String msg="";
		try {
			service.deleteStudent(id);
			msg="Success";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Failure";
		}
		return msg;
	}
}
