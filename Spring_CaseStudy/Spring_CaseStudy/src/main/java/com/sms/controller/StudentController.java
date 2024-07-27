package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;

import antlr.collections.List;

@Controller
//@ComponentScan(basePackages = {"com.sms.controller"})
public class StudentController {
	
//	@Autowired
	StudentDao dao = new StudentDao();
	
	@GetMapping("/Title")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView("Title");
		return mv;
	}
	
	@GetMapping("/Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}
	
	@GetMapping("/Buttons")
	public ModelAndView loadButtons() {
		ModelAndView mv = new ModelAndView("Buttons");
		return mv;
	}
	
	@GetMapping("/Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@PostMapping("/Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student stud) {
		int n = dao.insertStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		if(n>0) {
			mv.addObject("Action","Success");
		}
		else {
			mv.addObject("Action","Failure");
		}
		return mv;
	}
	
	@RequestMapping("Delete")
		public ModelAndView loaddoDelete() {
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Delete");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@PostMapping("Deletion")
		public ModelAndView doDelete(@ModelAttribute("bean") Student stud) {
			dao.studentDelete(stud);
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Delete");
			mv.addObject("Action","Success");
			mv.addObject("IdList",idList);
			
			return mv;
		}
		
		 
		
		@RequestMapping("ViewAll")
		public ModelAndView loadViewAll() {
			java.util.List<Student> StudentList = dao.fetchAll();
			ModelAndView mv = new ModelAndView("ViewAll");
			mv.addObject("StudList",StudentList);
			return mv;
		}
		
		@RequestMapping("Find")
		public ModelAndView loadFind() {
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@RequestMapping("FetchFind")
		public ModelAndView loaddoFetchfind(@RequestParam("sid") int id) {
			Student stud = dao.fetchOne(id);
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("studfind",stud);
			return mv;
		}
		
		@PostMapping("Finding")
		public ModelAndView dofinding(@ModelAttribute("bean") Student stud) {
			dao.findstu(stud);
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("StudfindList",idList);
			return mv;
		}
}
