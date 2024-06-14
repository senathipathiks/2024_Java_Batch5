package com.prabha.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prabha.demo.model.Student;
import com.prabha.demo.service.StudentServiceImpl;
 

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl service;

	
	@GetMapping("")
	public ModelAndView loadIndex() {
		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("Action",null);
		return mv;
	}
 
	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
//		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Insertion")
	public ModelAndView performInsert(Student stud) {
		String msg=service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",msg);
		return mv;
	}
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", service.idList());
		mv.addObject("NameList", service.nameList());
		return mv;
	}
 
	@PostMapping("Deletion")
	public ModelAndView dodelete(@RequestParam("sid") int id) {
		String msg = service.deleteStudent(id);
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("NameList", service.nameList());
		mv.addObject("Action", msg);
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("DeleteByName")
	public ModelAndView loadDeleteByName() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("NameList", service.nameList());
		return mv;
	}
 
	@PostMapping("DeletionByName")
	public ModelAndView dodeleteByName(@RequestParam("sname") String name) {
		List<String> nameList = service.nameList();
		String msg = service.deleteStudentByName(name);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action", msg);
		mv.addObject("NameList", nameList);
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		return mv;
	}
	@RequestMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("id") int id) {
		Student stud = service.fetchOne(id);
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Stud",stud);
		mv.addObject("IdList",idList);
		return mv;
	}
 
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		List<Integer> idList = service.idList();
		service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Action","Success");
		mv.addObject("IdList",idList);
		
		return mv;
	}
	
	@RequestMapping("ViewAll")
	public ModelAndView doViewAll() {
		List<Student> studlist = service.fetchAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		mv.addObject("Studlist",studlist);
		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@RequestMapping("Fetch1")
	public ModelAndView doFetch1(@RequestParam("sid") int id) {
		Student stud = service.fetchtwo(id);
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("Stud",stud);
		mv.addObject("IdList",idList);
		return mv;
	}
	
	
	@PostMapping("Findpost")
	public ModelAndView doFindpost( Student stud) {
		List<Integer> idList = service.idList();
		service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("Action","Success");
		mv.addObject("IdList",idList);
		
		return mv;
	}
	
	
	
	
}