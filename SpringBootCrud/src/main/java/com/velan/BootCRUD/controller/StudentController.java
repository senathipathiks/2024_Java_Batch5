package com.velan.BootCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.velan.BootCRUD.bean.Student;
import com.velan.BootCRUD.service.StudentServiceTmp1;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceTmp1 service;
 
	@GetMapping("index")
	public ModelAndView loadIndex() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("Links")
	public ModelAndView loadLink() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@GetMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}
	
	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
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
		mv.addObject("IdList",service.idList());
		return mv;
	}
	@PostMapping("Deletion")
	public ModelAndView doDelete(Student stud) {
	    List<Integer>idList=service.idList();
	    service.deleteStudent(stud);
	    ModelAndView mv=new ModelAndView("Delete");
	    mv.addObject("Action","Success");
	    mv.addObject("IdList",idList);
		return mv;
		
	}
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
	    ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",service.idList());
		return mv;
	}
	
	@RequestMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("sid") int id) {
	    Optional<Student> stud = service.fetchOne(id);
	    ModelAndView mv = new ModelAndView("Update"); 
	    mv.addObject("Stud", stud.orElse(null)); 
	    mv.addObject("IdList", service.idList()); 
	    return mv;
	}
	
	@PostMapping("Updation")
	public ModelAndView doUpdate(Student stud) {
	    List<Integer>idList=service.idList();
	    service.UpdateStudent(stud);
	    ModelAndView mv=new ModelAndView("Update");
	    mv.addObject("Action","Success");
	    mv.addObject("IdList",idList);
		return mv;
		
	}
	
	@RequestMapping("Search")
	public ModelAndView loadSearch() {
		ModelAndView mv = new ModelAndView("Search");
		mv.addObject("IdList",service.idList());
		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView doSearch(@RequestParam("sid") int id) {
		Optional<Student> stud=service.fetchOne(id);
		ModelAndView mv = new ModelAndView("Search");
		mv.addObject("Stud",stud.orElse(null));
		mv.addObject("IdList",service.idList());
		return mv;
	}
	
	@RequestMapping("ViewAll")
	public ModelAndView doViewAll() {

		List<Student> studList=service.fetchAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		
		mv.addObject("StudList",studList);
		return mv;
	}
}
