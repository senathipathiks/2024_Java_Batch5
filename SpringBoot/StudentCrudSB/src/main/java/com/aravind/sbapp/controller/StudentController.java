package com.aravind.sbapp.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aravind.sbapp.model.Student;
import com.aravind.sbapp.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
	
	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("Index");
		return mv;
	}

	@GetMapping("insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Insertion")
	public ModelAndView performInsert(Student stud) {
		String msg = service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",msg);
		return mv;
	}
	
	@RequestMapping("delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList",service.idList());
		return mv;
		
 	}
	
//	@RequestMapping("delete")
//	public ModelAndView loadDelete() {
//		ModelAndView mv = new ModelAndView("Delete");
//		mv.addObject("IdList",service.idList());
//		mv.addObject("Action",null);
//		return mv;
//		
// 	}
	
	@PostMapping("Deletion")
	public ModelAndView performDelete(Student stud) {
		List<Integer> idList = service.idList();
		String msg = service.deleteStudent(stud);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action",msg);
		mv.addObject("IdList",idList);
		return mv;
 		
	}
	
//	@PostMapping("Deletion")
//	public ModelAndView performDelete(@RequestParam("sid") int id) {
//		List<Integer> idList = service.idList();
//		String msg = service.deleteStudent(id);
//		ModelAndView mv = new ModelAndView("Delete");
//		mv.addObject("Action",msg);
//		mv.addObject("IdList",idList);
//		return mv;
// 		
//	}
	
	@RequestMapping("update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		return mv;
		
 	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("sid") int id) {
		Optional<Student> stud= service.fetchOne(id);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Stud",stud.orElse(null));
		mv.addObject("IdList",service.idList());
		return mv;	
 	}
	
	@PostMapping("Updation")
	public ModelAndView performUpdate(Student stud) {
		List<Integer> idList = service.idList();
		String msg = service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Action",msg);
		mv.addObject("IdList",idList);
		return mv;
 		
	}
	
	@RequestMapping("search")
	public ModelAndView loadSearch() {
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList",service.idList());
		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView doSearch(@RequestParam("sid") int id) {
		Optional<Student> stud=service.fetchOne(id);
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("Stud",stud.orElse(null));
		mv.addObject("IdList",service.idList());
		return mv;
	}
	
	@RequestMapping("viewall")
	public ModelAndView doViewAll() {
 
		List<Student> studList=service.fetchAll();
		ModelAndView mv = new ModelAndView("View");
		
		mv.addObject("Studlist",studList);
		return mv;
	}
	
	
}
