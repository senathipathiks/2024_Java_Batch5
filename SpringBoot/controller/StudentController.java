package com.spring.restapi.controller;

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

import com.spring.restapi.model.Student;
import com.spring.restapi.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("/Student")
@CrossOrigin("*") // to connect front-end with backend
public class StudentController {
	
	@Autowired
	StudentServiceImpl service;
	
	
	//creation - so use post method
	
	static final String SUCESS = "success";
	static final String FAILURE = "failure";
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		
		String msg="";
		try {
			
			service.addStudent(stud);
			msg=SUCESS;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			msg=FAILURE;
			
		}
		return msg;
	}

	
	//viewing particular record using id
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id")int id) {
		return service.getStudent(id);
		
	}
	
	//viewing all records
	
	@GetMapping("/all")
	public List<Student> getStudents() {
		return service.getAllStudents();
		
	}
	
	//to update record use put mapping 
	
	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		
		String msg="";
		try {
			
			service.updateStudent(stud);
			msg=SUCESS;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			msg=FAILURE;
			
		}
		return msg;
	}

	
	//delete record- use delete method
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable("id")int id) {
		
		String msg="";
		try {
			
			service.deleteStudent(id);
			msg=SUCESS;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			msg=FAILURE;
			
		}
		return msg;
	}
}
