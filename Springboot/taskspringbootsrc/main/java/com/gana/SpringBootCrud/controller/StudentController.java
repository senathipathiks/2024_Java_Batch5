package com.gana.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gana.SpringBootCrud.model.Student;
import com.gana.SpringBootCrud.service.StudentServiceImplementation;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImplementation service;
	public StudentServiceImplementation getService() {
		return service;
	}

	public void setService(StudentServiceImplementation service) {
		this.service = service;
	}
	
	@GetMapping("")
	public ModelAndView loadindex() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("banner");
		return mv;
	}
	
	@GetMapping("links")
	public ModelAndView loadlinks() {
		ModelAndView mv = new ModelAndView("links");
		return mv;
	}

	@GetMapping("insert")
	public ModelAndView loadinsert() {
		ModelAndView mv = new ModelAndView("insert");
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("insertion")
	public ModelAndView performinsert(Student stud) {
		String msg = service.addStudent(stud);
		ModelAndView mv = new ModelAndView("insert");
		mv.addObject("Action",msg);
		return mv;
	}
	
	@GetMapping("delete")
	public ModelAndView loaddelete() {	
		List<Integer> idList=service.getIdList();	
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("IdList", idList);
		mv.addObject("Action",null);
		
		return mv;
	}
	
	@PostMapping("deletion")
	public ModelAndView performdelete(@RequestParam("id") int n) {
		service.deleteStudent(n);
		List<Integer> idList=service.getIdList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("IdList", idList);
		mv.addObject("Action","Success");
		
		return mv;
	}
	
	@GetMapping("deletebyname")
	public ModelAndView loaddeletebyname() {	
		List<String> nameList=service.getNameList();	
		ModelAndView mv = new ModelAndView("deletebyname");
		mv.addObject("NameList", nameList);
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("deletionbyname")
	public ModelAndView performdeletebyname(@RequestParam("name") String n) {
		service.deleteStudentByName(n);
		List<String> nameList=service.getNameList();
		ModelAndView mv = new ModelAndView("deletebyname");
		mv.addObject("NameList", nameList);
		mv.addObject("Action","Success");
		
		return mv;
	}
	
	@GetMapping("update")
	public ModelAndView loadupdate() {	
		List<Integer> idList=service.getIdList();	
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("fetch")
	public ModelAndView dofetch(@RequestParam("id") int id) {
		Student stud = service.fetchOne(id);
		List<Integer> idList=service.getIdList();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("stud", stud);
		mv.addObject("IdList", idList);
		return mv;
		
	}
	
	@PostMapping("updation")
	public ModelAndView doupdate(Student stud) {
		List<Integer> idList=service.getIdList();
		service.updateStudent(stud);	
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("Action","Success");
		return mv;
	}
	
	@GetMapping("find")
	public ModelAndView loadfind() {	
		List<Integer> idList=service.getIdList();	
		ModelAndView mv = new ModelAndView("find");
		mv.addObject("IdList", idList);
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Searching")
	public ModelAndView performfind(@RequestParam("id") int n) {
		ModelAndView mv = new ModelAndView("find");
		Student stud =service.findStudent(n);
		mv.addObject("Stud",stud);
		mv.addObject("Action","Success");
		return mv;
	}
	
	
	@GetMapping("findbyname")
	public ModelAndView loadfindbyname() {	
		List<String> nameList=service.getNameList();	
		ModelAndView mv = new ModelAndView("findbyname");
		mv.addObject("NameList", nameList);
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Searchingbyname")
	public ModelAndView performfindbyname(@RequestParam("name") String n) {
		ModelAndView mv = new ModelAndView("findbyname");
		Student stud =service.findStudentByName(n);
		mv.addObject("Stud",stud);
		mv.addObject("Action","Success");
		return mv;
	}
	
	@GetMapping("viewall")
	public ModelAndView loadviewall() {
		List<Student> studList=service.getStudList();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("StudList",studList);
		mv.addObject("Action",null);
		return mv;
	}

}
