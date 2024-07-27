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

import com.SpringBoot.Eg8.Model.Teacher;
import com.SpringBoot.Eg8.Service.TeacherServiceImplementation;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherController 
{
	@Autowired
	TeacherServiceImplementation service;
	
	@PostMapping
	public String insertTeacher(@RequestBody Teacher teacher)
	{
		String msg = "";
		try {
			service.addTeacher(teacher);
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("{tid}")
	public Teacher readTeacher(@PathVariable("tid") int tid)
	{
		return service.getTeacher(tid);		
	}
	
	@GetMapping("/all")
	public List<Teacher> readAllTeacher()
	{
		return service.getallTeacher();
	}
	
	@PutMapping
	public  String updateTeacher(@RequestBody Teacher teacher)
	{
		String msg = "";
		try {
			service.updateTeacher(teacher);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{tid}")
	public String deleteTeacherById(@PathVariable("tid") int tid)
	{
		String msg = "";
		try {
			service.deleteTeacher(tid);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
