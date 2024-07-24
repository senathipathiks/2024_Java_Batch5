package com.supraja.restapp.controller;

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
import com.supraja.restapp.model.Student;
import com.supraja.restapp.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	StudentServiceImpl service;

	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.addStudent(stud);
			System.out.println(stud);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public Student getStudentbyId(@PathVariable("id") int id) {
		return service.getStudent(id);
	}

	@GetMapping("/all")
	public List<Student> getStudent() {
		return service.getAllStudent();
	}

	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.updateStudent(stud);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteStudent(id);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}
}
