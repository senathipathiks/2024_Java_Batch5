package com.springboot.StudentCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.StudentCrud.Model.Student;
import com.springboot.StudentCrud.Service.StudentServiceImplementation;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImplementation service;

	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView  mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Insertion")
	public ModelAndView doInsert(Student stud) {
		String msg = service.addStudent(stud);
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",msg);
		return mv;
	}

	@GetMapping("alldetails")
	public ModelAndView doViewAll(Student stud) {
		List<Student> list = service.viewAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		mv.addObject("Studlist",list);
		return mv;
	}
	
	@GetMapping("Delete")
	public ModelAndView loadDelete() {
		List<Integer> list = service.getIdList();
		List<String> nameList = service.getNameList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("list",list);
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	
	@PostMapping("Deletion")
	public ModelAndView dodel(@RequestParam("sid") int sid) {
		List<Integer> list = service.getIdList();
		service.delStu(sid);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("list",list);
		mv.addObject("Action","Success");
		return mv;
	}
	
	@PostMapping("DeleteByName")
	public ModelAndView dodelbyname(@RequestParam("sname") String sname) {
		List<String> nameList = service.getNameList();
		service.deletename(sname);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("nameList",nameList);
		mv.addObject("Action","Success");
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("idlist",idList);
		return mv;
	}
	
	@RequestMapping("Fetch")
	public ModelAndView loaddoFetch(Student student) {
		Student stud = service.fetchOne(student.getSid());
		List<Integer> idList = service.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("studfetch",stud);
		mv.addObject("idlist",idList);
		return mv;
	}
	
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		List<Integer> idlist = service.getIdList();
		service.updateStudent(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Action","Success");
		mv.addObject("idlist",idlist);
		return mv;
	}
}
