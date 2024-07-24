package com.giri.sbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.giri.sbapp.model.Student;
import com.giri.sbapp.serviceimpl.StudentServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	
@Autowired
StudentServiceImpl service;

@PostMapping
public String insertStudent(@RequestBody Student stud) {
	
	String msg="";
	try {
		service.addStudent(stud);
		msg="Success";
		
	}catch(Exception e) {
		e.printStackTrace();
		msg="Failre";
	}
	return msg;
}
	
	@GetMapping("{id}")
	public Student getStudentById (@PathVariable("id") int id) {
		return service.getStudent(id);
	}
	@GetMapping("/all")
	public List<Student> getStudents () {
		return service.getAllStudent();
	}
	
	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		
		String msg="";
		try {
			service.updateStudent(stud);
			msg="Success";
			
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failre";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deleteStudentId(id);
			msg="Success";
			
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failre";
		}
		return msg;
		
		
	}
	
	
	
}

