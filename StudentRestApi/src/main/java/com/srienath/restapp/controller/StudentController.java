package com.srienath.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srienath.restapp.model.Student;
import com.srienath.restapp.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceImpl service;
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud)
	{
		String msg="";
		try {
			service.addStudent(stud);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudent(id);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody Student stud)
	{
		String msg="";
		try {
			service.updateStudent(stud);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deleteStudent(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
