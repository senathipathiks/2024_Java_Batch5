package com.madhan.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhan.restapp.model.Student;
import com.madhan.restapp.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:3000")
public class StudentController {

	StudentServiceImpl service;
	
	
	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertStudent(@RequestBody Student stud)
	{
		String msg="";
		try {
			service.addStudent(stud);
			msg="Success done";
		} 
		
		catch(Exception e) {
			
			msg="Failure done";
		}
		
		return msg;
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
	return service.getStudent(id);
}
	
	@GetMapping("/all")
	public List<Student> getStudent()
	{
	return service.getAllStudents();
}
	
	@PutMapping
	public String updateStudent(@RequestBody Student stud)
	{
		String msg="";
		try {
			service.updateStudent(stud);
			msg="Success is done";
		} 
		
		catch(Exception e) {
			
			msg="Failure is done";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable("id") int  id)
	{
		String msg="";
		try {
			service.deleteStudent(id);
			msg="Success good";
		} 
		
		catch(Exception e) {
			
			msg="Failure good";
		}
		
		return msg;
	}
}
