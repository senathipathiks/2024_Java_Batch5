package com.karthi.StudentRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.StudentRestApi.model.User;
import com.karthi.StudentRestApi.service.StudentServiceImpl;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentRestController {
	@Autowired
	StudentServiceImpl serviceImpl;
	
	@PostMapping
	public String insertStudent(@RequestBody User student) {
		String msg = "";
		try {
			serviceImpl.addStudent(student);
			msg = "Success";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public User getStudenById(@PathVariable("id") int id) {
		return serviceImpl.getStudent(id);
	}
	
	@GetMapping("/all")
	public List<User> getStudens() {
		return serviceImpl.getAllStudents();
	}
	
	@PutMapping()
	public String updateStudentData(@RequestBody User student) {
		String msg = "";
		try {
			serviceImpl.updateStudent(student);
			msg = "Success";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	} 
	
	@DeleteMapping("{id}")
	public String deleteStudentData(@PathVariable("id") int id) {
		serviceImpl.deleteStudent(id);
		return "Success";
	}
}
