package com.karthi.StudentCrudSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.karthi.StudentCrudSP.model.Student;
import com.karthi.StudentCrudSP.service.StudentserviceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentserviceImpl studentserviceImpl;
	
	@GetMapping("abc")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		List<Student> students = studentserviceImpl.viewStudents();
		mv.addObject("students", students);
		return mv;
	}
	
	@PostMapping("abc")
	public ModelAndView indexvalue(@RequestParam("action") String action, @RequestParam("name") String name, @RequestParam("city") String city) {
		String[] actionParts = action.split("_");
		String actionType = actionParts[0];
		int id = Integer.parseInt(actionParts[1]);
		ModelAndView mv = new ModelAndView("index");
		System.out.println("Button clicked with ID: " + id);
		System.out.println("Button Action : " + actionType);
		if(actionType.equals("save")) {
			Student student = new Student();
			student.setName(name);
			student.setCity(city);
			studentserviceImpl.addStudent(student);
		}
		List<Student> students = studentserviceImpl.viewStudents();
		mv.addObject("students", students);
		return mv;
	}
}
