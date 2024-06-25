package com.srienath.sbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srienath.sbapp.model.Student;
import com.srienath.sbapp.service.StudentServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	@Autowired 
	private StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}
	
	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	@GetMapping("Insertion")
	public ModelAndView performInsert(Student stud) {
		String msg=service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		
		mv.addObject("Action","Success");
		
		return mv;
	}
	@GetMapping("Delete")
	public ModelAndView loadDelete() {
		List<Integer> idList = service.getIdList();
		List<String> nameList = service.getNameList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList",idList);
		mv.addObject("NameList",nameList);
		mv.addObject("Action",null);
		return mv;
	}
	
	@GetMapping("Deletion")
	public ModelAndView doDeleteById(@RequestParam("sid") int id) {
		List<Integer> idList = service.getIdList();
		service.deleteStudent(id);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action1","Success");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@GetMapping("DeletionByName")
	public ModelAndView doDeleteByName(@RequestParam("sname") String name) {
		List<String> nameList = service.getNameList();
		service.deleteStudentBySname(name);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action2","Success");
		mv.addObject("NameList",nameList);
		return mv;
	}
	
	@GetMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Fetch")
	public ModelAndView fetch(@RequestParam("sid") int id) {
		Student stud=service.fetchOne(id);
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Stud",stud);
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Updation")
	public ModelAndView doUpdate(HttpServletRequest req) {
		int id= Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("sname");
		String city = req.getParameter("scity");
		
		Student stud=new Student(id,name,city);
				
		System.out.println(stud.getId());
		List<Integer> idList=service.getIdList();
		
		service.updateStudent(stud);
		ModelAndView mv=new ModelAndView("Update");
		mv.addObject("Action3", "Success");
		mv.addObject("IdList", idList);
		return mv;
	}
	
	
	
	
	
	
}
