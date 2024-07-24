package com.nandha.Myapplication.controller;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nandha.Myapplication.model.Student;
import com.nandha.Myapplication.service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl service;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}


	@GetMapping("Insert")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", null);

		return mv;
	}

	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student student) {
		String msg = service.addStudent(student);
		ModelAndView mv = new ModelAndView("insert");
		mv.addObject("Action", msg);

		return mv;
	}

	@GetMapping("Display")
	public ModelAndView doDisplay() {
		ModelAndView mv = new ModelAndView("Display");
		List<Student> stuList = service.studentDisplay();
		mv.addObject("students", stuList);
		return mv;
	}

	@GetMapping("Find")
	public ModelAndView listIdFind() {
		List<Integer> idList = service.findAllIds();
		List<String> nameList = service.findAllNames();

		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList", idList);
		mv.addObject("NameList", nameList);

		return mv;
	}

	@PostMapping("Searching")
	public ModelAndView doSearch(Student stud) {
		Student student = service.findStudent(stud);
		List<Integer> idList = service.findAllIds();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);
		mv.addObject("Action", "Success");
		return mv;
	}

	@PostMapping("SearchingName")
	public ModelAndView doSearchName(@ModelAttribute("bean") Student stud) {
//		System.out.println(stud);
		Student student = service.findStudentName(stud);
		List<String> nameList = service.findAllNames();
		ModelAndView mv = new ModelAndView("Find");
//		System.out.println("hello");
		mv.addObject("NameList", nameList);
		mv.addObject("student", student);
		mv.addObject("Action", "Success");
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView listIdDelete() {
		List<Integer> idList = service.findAllIds();
		List<String> nameList = service.findAllNames();

		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", idList);
		mv.addObject("NameList", nameList);

		return mv;
	}

	@PostMapping("Deletion")
	public ModelAndView doDelete(@RequestParam("studid") int id) {
		List<Integer> idList = service.findAllIds();

		service.deleteStudent(id);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action", "Success");
		mv.addObject("IdList", idList);

		return mv;
	}

	@PostMapping("DeletionName")
	public ModelAndView doDeleteName(@RequestParam("studName") String name) {
		List<String> nameList = service.findAllNames();
		service.deleteStudentName(name);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action", "Success");
		mv.addObject("NameList", nameList);
		return mv;
	}
	
	@GetMapping("Update")
	public ModelAndView listIdUpdate() {
		ModelAndView mv = new ModelAndView("Update");
		List<Integer> idList = service.findAllIds();
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(Student stud) {
		Student student = service.findStudent(stud);
		List<Integer> idList = service.findAllIds();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);
 
		return mv;
	}
 
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		List<Integer> idList = service.findAllIds();
		String msg = service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("Action", "Success");
 
		return mv;
	}

}
