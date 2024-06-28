package com.gana.restapp.controller;

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

import com.gana.restapp.model.Student;
import com.gana.restapp.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:6425")
public class StudentController {
	
	
	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}

	StudentServiceImpl service;
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud ) {
		
		String msg = "";
		try {
			service.addStudent(stud);
			msg =  "Insertion Success";
		}
		catch(Exception e) {
			
			msg = "Insertion Failure";
			
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
public String updateStudent(@RequestBody Student stud ) {
		
		String msg = "";
		try {
			service.updateStudent(stud);
			msg =  "Updation Success";
		}
		catch(Exception e) {
			
			msg = "Updation Failure";
			
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteStudent(id);
			msg =  "Deletion Success";
		}
		catch(Exception e) {
			
			msg = "Deletion Failure";
			
		}
		return msg;
	}

}
