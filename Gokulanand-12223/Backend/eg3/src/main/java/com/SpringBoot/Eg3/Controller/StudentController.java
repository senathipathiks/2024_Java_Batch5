package com.SpringBoot.Eg3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBoot.Eg3.model.Student;
import com.SpringBoot.Eg3.service.ServiceImplementation;

@Controller
public class StudentController 
{
	@Autowired
	ServiceImplementation service;

	@GetMapping("Insert")
	public ModelAndView loadInsert()
	{
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", null);
		return mv;		
	}
	
	@PostMapping("Insertion")
	public ModelAndView performInsert(Student stud)
	{
		String msg = service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action", "Success");
		return mv;
	}
	
	@GetMapping("Delete")
	public ModelAndView loadDelete()
	{
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", idList);
		mv.addObject("Action", null);
		return mv;		
	}
	
	@PostMapping("Deletion")
	public ModelAndView performDelete(@RequestParam("id")int id)
	{
		service.deleteStudent(id);
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", idList);
		mv.addObject("Action", "Success");
		return mv		;
	}
	
	@GetMapping("ViewAll")
	public ModelAndView doViewAll(Student stud) 
	{
		List<Student> stuList = service.viewAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		mv.addObject("Stu", stuList);
		return mv;		
	}
	
	@GetMapping("Update")
	public ModelAndView loadUpdate()
	{
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
	
		return mv;		
	}
	
	@GetMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("idrh76") int id) {
		Student student = service.findStudent(id);
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);
		return mv;
	}
 
	@PostMapping("Updation")
	public ModelAndView doUpdate(Student stud) {
		List<Integer> idList = service.getIdList();
		String msg = service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("Action", msg);
		return mv;
	}
	
}
