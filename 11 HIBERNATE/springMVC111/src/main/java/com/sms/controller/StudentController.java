package com.sms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;


@Controller
//@ComponentScan(basePackages = { "com.sms.controller" })
public class StudentController {

//	@Autowired
//	StudentDao dao = new StudentDao();

	@GetMapping("top")
	public ModelAndView loadTop() {
		ModelAndView mv = new ModelAndView("top");
		return mv;
	}

	@GetMapping("menu")
	public ModelAndView loadMenu() {
		ModelAndView mv = new ModelAndView("menu");
		return mv;
	}
	
//	@RequestMapping("Delete")
//	public ModelAndView loadDelete() {
//		List<Integer> idList=dao.idList();
//		ModelAndView mv=new ModelAndView("Delete");
//		mv.addObject("IdList", idList);
//		return mv;
//	}
	
//	@PostMapping("Deletion")
	
	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	

//	@GetMapping("Insert")
//	public ModelAndView loadInsert(@ModelAttribute("bean") Student stud) {
//		int n = dao.insertStudent(stud);
//		ModelAndView mv = new ModelAndView("Insert");
//		if (n > 0) {
//			mv.addObject("Action", "Success");
//		}
//		else {
//			mv.addObject("Action", "Failure");
//		}
//		return mv;
//	}
	
//	@RequestMapping
//	public ModelAndView loadDelete() {
//		List<Integer> idList=dao.idList();
//		ModelAndView mv=new ModelAndView("Update");
//		mv.addObject("IdList", idList);
//		return mv;
//	}
	
//	@PostMapping("Updation")
//	public ModelAndView doUpdate(@ModelAttribute ("bean") Student stud) {
//		List<Integer> idList=dao.idList();
//		ModelAndView mv=new ModelAndView("Update");
//		mv.addObject("IdList", idList);
//		return mv;
//	}
	
//	@RequestMapping("ViewAll")
//	public ModelAndView doViewAll() {
//		List<Integer> studList=dao.idList();
//		ModelAndView mv=new ModelAndView("ViewAll");
//		mv.addObject("IdList", studList);
//		return mv;
//	}
	
	

}
