package com.springboot.assessment2.controller;

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

import com.springboot.assessment2.model.Student;
import com.springboot.assessment2.service.StudentServiceImplementation;


@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController 
{
	
	StudentServiceImplementation service;

	public StudentController(StudentServiceImplementation service) {
		super();
		this.service = service;
	}

	@PostMapping
	public  String insertStudent(@RequestBody Student student)
	{
	String msg = "";
	try {
	service.addStudent(student);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Student> readAllStudent()
	{
	return service.getallStudent();
	}

	@PutMapping
	public  String updateStudent(@RequestBody Student student)
	{
	String msg = "";
	try {
	service.updateStudent(student);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{sid}")
	public String deleteStudentbyId(@PathVariable("sid") int sid)
	{
	String msg = "";
	try {
	service.deleteStudent(sid);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
}
