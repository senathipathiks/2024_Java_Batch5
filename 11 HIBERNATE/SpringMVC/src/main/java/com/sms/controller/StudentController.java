package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;

@Controller
//@ComponentScan(basePackages= {"com.ems.controller","com.ems.dao"})
public class StudentController {

//	@Autowired
	StudentDao dao = new StudentDao();
	
	@GetMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv  = new ModelAndView("Banner");
		return mv;
	}
	
	@GetMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	@PostMapping("Insertion")
	public ModelAndView loadInsert(@ModelAttribute("bean") Student stud) {
		int n = dao.insertStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		if (n > 0) {
			mv.addObject("Action", "Success");
		}
		else {
			mv.addObject("Action", "Failure");
		}
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		List<Integer> IdList=dao.idList();
		ModelAndView mv=new ModelAndView("Delete");
		mv.addObject("IdList", IdList);
		return mv;
	}
	@PostMapping("Deletion")
	public ModelAndView dodelete(@ModelAttribute("bean") Student stud) {
		List<Integer> IdList=dao.idList();
		dao.deleteStudent(stud);
		ModelAndView mv=new ModelAndView("Delete");
		mv.addObject("Action","Success");
		mv.addObject("IdList", IdList);
		return mv;
	}
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		return mv;
	}
	@RequestMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("id") int id) {
		Student stud = dao.fetchOne(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Stud",stud);
		mv.addObject("IdList",idList);
		return mv;
	}
 
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		List<Integer> idList = dao.idList();
		dao.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Action","Success");
		mv.addObject("IdList",idList);
		
		return mv;
	}
	
	@RequestMapping("ViewAll")
	public ModelAndView doViewAll() {
		
		List<Student> studlist = dao.fetchAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		mv.addObject("Studlist",studlist);
		return mv;
	}
	
	
	
}
