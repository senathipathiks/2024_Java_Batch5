package com.gopi.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gopi.sample.model.Student;
import com.gopi.sample.service.StudentServiceImplimentation;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImplimentation service;

	@GetMapping("index")
	public ModelAndView loadIndex() {
		ModelAndView mv = new ModelAndView("Index");
		return mv;
	}
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
		mv.addObject("Action", null);
		return mv;
	}

	@PostMapping("Insertion")
	public ModelAndView performInsert(Student stud) {

		String msg = service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", msg);
		return mv;
	}

	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", service.idList());
		return mv;
	}

	@PostMapping("Deletion")
	public ModelAndView dodelete(@RequestParam("sid") int id) {
		String msg = service.deleteStudent(id);
		List<Integer> idList = service.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action", msg);
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("DeleteByName")
	public ModelAndView loadDeleteByName() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("NameList", service.nameListDel());
		return mv;
	}

	@PostMapping("DeletionByName")
	public ModelAndView doDeleteByName(@RequestParam("sname") String sname) {
		String msg = service.deleteStudentByName(sname);
		List<String> nameList = service.nameListDel();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action1", msg);
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
	public ModelAndView findById() {
		List<Student> studlist = service.fetchAll();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList", service.idList());
		mv.addObject("Studlist",studlist);
		return mv;
	}
	@PostMapping("Searching")
	public ModelAndView dofindById(@RequestParam("sid") int id) {
		Student stud = service.fetchById(id);
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("Action","Success");
		mv.addObject("Stud",stud);
		return mv;
	}
	
	@RequestMapping("FindByName")
	public ModelAndView findByName() {
		List<Student> studlist = service.fetchAll();
		ModelAndView mv = new ModelAndView("FindByName");
		List<String> nameList = service.nameList();
		mv.addObject("NameList",nameList);
		mv.addObject("Studlist",studlist);
		return mv;
	}
	@PostMapping("SearchingByName")
	public ModelAndView dofindByName(@RequestParam("sname") String sname) {
		Student stud = service.fetchBySname(sname);
		ModelAndView mv = new ModelAndView("FindByName");
		mv.addObject("Action","Success");
		mv.addObject("Stud",stud);
		return mv;
	}
	
	@PostMapping("operation")
	public ModelAndView doOperation(@RequestParam("action")String action, @RequestParam("sid") int id, @RequestParam("sname") String name, @RequestParam("scity") String city) {
		ModelAndView mv = new ModelAndView("ViewAll");
		Student stud = new Student(id,name,city);
		if("Save".equals(action)) {
			service.updateStudent(stud);
			mv.addObject("Action","Success");
		}
		else if("Delete".equals(action)) {
			service.deleteStudent(id);
			mv.addObject("Action1", "Success");
		}
		
		else if("Add".equals(action)) {
			String msg = service.addStudent(stud);
			mv.addObject("Action2", msg);
		}
		return mv;
	}
	
	
	
}
