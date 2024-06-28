package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Student;
import com.vickee.restapp.serviceimpl.StudentServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

	@Autowired
	StudentServiceImpl service;
	
	static final String SUCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg="";
		try {
			service.addStudent(stud);
			msg=SUCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			msg=FAILURE;
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
			msg=SUCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			msg=FAILURE;
		}
	return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deleteStudent(id);
			msg=SUCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			msg=FAILURE;
		}
		return msg;
	}
	
}
