package com.SpringBoot.Eg5.Controller;

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

import com.SpringBoot.Eg5.Model.Student;
import com.SpringBoot.Eg5.Service.ServiceImplementation;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class Controller 
{
	@Autowired
	ServiceImplementation service;
	
	@PostMapping
	public  String insertStudent(@RequestBody Student student)
	{
		String msg = "";
		try {
			service.addStudent(student);
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Student readStudent(@PathVariable("id") int id)
	{
		return service.getStudent(id);		
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
			service.updateStudent(student);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentbyId(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteStudent(id);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
