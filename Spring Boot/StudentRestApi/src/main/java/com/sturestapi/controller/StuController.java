package com.sturestapi.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sturestapi.model.Student;
import com.sturestapi.service.StuServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StuController {

	Logger log = Logger.getLogger(getClass().getName());
	
	public StuController(StuServiceImpl service) {
		super();
		this.service = service;
	}

	StuServiceImpl service;

	String suc="Success";
	String fail = "Failure";
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg="";
		try {
			service.addStudent(stud);
			log.info(suc);
		}
		catch(Exception e) {
			log.info(fail);
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Optional<Student> getStudentbyId(@PathVariable("id") int id) {
		return service.getStudent(id);
	}

	@GetMapping("/all")
	public List<Student> viewallStudent() {
		return service.getAllStudents();
	}
	
	@PutMapping
	public String updStu(@RequestBody Student stud) {
		String msg="";
		try {
			service.updateStu(stud);
			log.info(suc);
		}
		catch(Exception e) {
			log.info(fail);
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String delStudentbyId(@PathVariable("id") int id) {
		String msg="";
		try {
			service.delStu(id);
			log.info(suc);
		}
		catch(Exception e) {
			log.info(fail);
		}
		return msg;
	}
	
}
