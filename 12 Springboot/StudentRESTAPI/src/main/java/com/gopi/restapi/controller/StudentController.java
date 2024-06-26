package com.gopi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.restapi.model.Student;
import com.gopi.restapi.serviceimpl.StudentServiceImpl;

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

	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msgString = "";
		
		try {
			service.addStudent(stud);
			msgString = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msgString = "Failure";
		}
		return msgString;
	}
	
//	@GetMapping("{id}")
//	public Student getStudentById(@PathVariable("id") int id) {
//		return service.getStudent(id);
//	}
//	
//	@GetMapping("/all")
//	public List<Student> getStudent() {
//		return service.getAllStudents();
//	}
//	@PutMapping
//	public String updateStudent(@RequestBody Student stud) {
//		String msgString = "";
//		
//		try {
//			service.updateStudent(stud);
//			msgString = "Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			msgString = "Failure";
//		}
//		return msgString;
//	}
//	@DeleteMapping("{id}")
//	public String deleteStudentById(@PathVariable("id") int id) {
//		String msgString = "";
//		try {
//			service.deleteStudent(id);
//			msgString = "Success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			msgString = "Failure";
//		}
//		return msgString;	
//	}

}