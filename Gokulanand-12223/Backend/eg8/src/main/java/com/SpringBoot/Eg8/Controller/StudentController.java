package com.SpringBoot.Eg8.Controller;

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

import com.SpringBoot.Eg8.Model.Student;
import com.SpringBoot.Eg8.Service.StudentServiceImplementation;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController 
{
	@Autowired
	StudentServiceImplementation service;
	
	@PostMapping
	public String insertStudent(@RequestBody Student student)
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
	
	@GetMapping("{stuid}")
	public Student readStudent(@PathVariable("stuid") int stuid)
	{
		return service.getStudent(stuid);		
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
	
	@DeleteMapping("{stuid}")
	public String deleteStudentById(@PathVariable("stuid") int stuid)
	{
		String msg = "";
		try {
			service.deleteStudent(stuid);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
