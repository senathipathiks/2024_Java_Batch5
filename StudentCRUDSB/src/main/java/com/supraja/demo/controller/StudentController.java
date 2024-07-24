package com.supraja.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.supraja.demo.Bean.Student;
import com.supraja.demo.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	StudentServiceImpl Service;

	public StudentServiceImpl getService() {
		return Service;
	}

	public void setService(StudentServiceImpl service) {
		Service = service;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", null);
		return mv;
	}

	@RequestMapping("Insertion")
	public ModelAndView performInsert(Student stud) {
		String msg = Service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", msg);
		return mv;
	}

//	   @GetMapping("Delete")
//		public ModelAndView loadDelete() {
//		  
//			//List<Integer> idList=dao.idList();
//			ModelAndView mv=new ModelAndView("Delete");
//			mv.addObject("idList", Service.idList());
//			return mv;
//		}
//	   
//	    @PostMapping("Deletion")
//	    public ModelAndView doDelete(Student stud)
//	    {
//	    	List<Integer> idList=Service.idList();
//	    	String msg=Service.deleteStudent(stud);
//	    	ModelAndView mv=new ModelAndView("Delete");
//	    	mv.addObject("Action",msg);
//	    	mv.addObject("idList",idList);
//	    	return mv;
//	    }

	@GetMapping("Delete")
	public ModelAndView loadDelete() {

		List<Integer> idList = Service.idList();
		List<String> nameList = Service.getNameList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("nameList", nameList);
		mv.addObject("idList", idList);
		mv.addObject("Action", null);
		return mv;
	}

	@RequestMapping("Deletion")
	public ModelAndView performDelete(@RequestParam("sid") int id) {
		Service.deleteStudent(id);
		List<Integer> idList = Service.idList();

		ModelAndView mv = new ModelAndView("Delete");

		mv.addObject("Action", "Success");
		mv.addObject("idList", idList);
		return mv;
	}

	@RequestMapping("DeleteByName")
	public ModelAndView deleteByName(@RequestParam("sname") String name) {
		Service.deleteName(name);
		List<String> nameList = Service.getNameList();

		ModelAndView mv = new ModelAndView("Delete");

		mv.addObject("Action", "Success");
		mv.addObject("idList", nameList);
		return mv;
	}
	
	@RequestMapping("Update")
		public ModelAndView loadUpdate() {
			List<Integer> idList = Service.idList();
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("IdList",idList);
			return mv;
		}
		@RequestMapping("Fetch")
		public ModelAndView doFetch(@RequestParam("sid") int id) {
			Student stud = Service.fetchOne(id);
			List<Integer> idList = Service.idList();
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("Stud",stud);
			mv.addObject("IdList",idList);
			return mv;
		}
	 
		@PostMapping("Updation")
		public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
			List<Integer> idList = Service.idList();
			Service.updateStudent(stud);
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("Action","Success");
			mv.addObject("IdList",idList);
			
			return mv;
		}
		
		@RequestMapping("Find")
		public ModelAndView loadFind() {
			List<Integer> idList= Service.idList();
			ModelAndView mv=new ModelAndView("FindById");
			mv.addObject("IdList", idList);
			return mv;
		}
		@RequestMapping("Fetch1")
		public ModelAndView doFetch1(@RequestParam("sid") int id) {
			Student stud= Service.fetchOne(id);
			List<Integer> idList= Service.idList();
			ModelAndView mv=new ModelAndView("FindById");
			mv.addObject("Stud", stud);
			mv.addObject("IdList", idList);
			return mv;
		}
}
