package com.karthi.StudentCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.karthi.StudentCRUD.model.Student;
import com.karthi.StudentCRUD.service.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceImpl serviceImpl;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("Heading")
	public ModelAndView heading() {
		ModelAndView mv = new ModelAndView("Heading");
		return mv;
	}

	@GetMapping("Menu")
	public ModelAndView menu() {
		ModelAndView mv = new ModelAndView("Menu");
		return mv;
	}
	
	@GetMapping("Insert")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@PostMapping("Insertion")
	public ModelAndView performInsert(Student student) {
		ModelAndView mv = new ModelAndView("Insert");
		String msg = serviceImpl.addStudent(student);
		mv.addObject("Action", msg);
		return mv;
	}
	
	@GetMapping("ViewAll")
	public ModelAndView doViewAll() {
		ModelAndView mv = new ModelAndView("ViewAll");
		List<Student> stuList = serviceImpl.viewStudents();
		mv.addObject("students",stuList);
		return mv;
	}
	
	@GetMapping("Delete")
	public ModelAndView listIdDelete() {
		List<Integer> idList = serviceImpl.getIdList();
		
		List<String> nameList = serviceImpl.getNameList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", idList);
		mv.addObject("NameList", nameList);
		return mv;
	}

	@PostMapping("DeletionById")
	public ModelAndView doDelete(@RequestParam("id") int id) {
		serviceImpl.deleteStudentById(id);
		ModelAndView mv = new ModelAndView("Delete");
		List<Integer> idList = serviceImpl.getIdList();
		List<String> nameList = serviceImpl.getNameList();
		mv.addObject("Action", "Success");
		mv.addObject("IdList", idList);
		mv.addObject("NameList", nameList);
		return mv;
	}
	
	@PostMapping("DeletionByName")
	public ModelAndView doDelete(@RequestParam("name") String name) {
		serviceImpl.deleteStudentByName(name);
		ModelAndView mv = new ModelAndView("Delete");
		List<Integer> idList = serviceImpl.getIdList();
		List<String> nameList = serviceImpl.getNameList();
		mv.addObject("Action", "Success");
		mv.addObject("IdList", idList);
		mv.addObject("NameList", nameList);
		return mv;
	}
	
	@GetMapping("FindById")
	public ModelAndView doFind() {
		ModelAndView mv = new ModelAndView("Find");
		List<Integer> idList = serviceImpl.getIdList();
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Searching")
	public ModelAndView doFindStudent(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("Find");
		Student student = serviceImpl.findStudent(id);
		List<Integer> idList = serviceImpl.getIdList();
		mv.addObject("IdList",idList);
		mv.addObject("student", student);
		return mv;
	}
	
	@GetMapping("Update")
	public ModelAndView listIdUpdate() {
		ModelAndView mv = new ModelAndView("Update");
		List<Integer> idList = serviceImpl.getIdList();
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("id") int id) {
		Student student = serviceImpl.findStudent(id);
		List<Integer> idList = serviceImpl.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);

		return mv;
	}

	@PostMapping("Updation")
	public ModelAndView doUpdate(Student stud) {
		List<Integer> idList = serviceImpl.getIdList();
		String msg = serviceImpl.updateStudent(stud); 
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("Action", "Success");

		return mv;
	}
}
