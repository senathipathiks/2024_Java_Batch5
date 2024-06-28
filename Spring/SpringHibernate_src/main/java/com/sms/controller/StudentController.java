package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;

@Controller
//@ComponentScan(basePackages = "com.sms.controller")
public class StudentController {
	@Autowired
	StudentDao dao;

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
	public ModelAndView headding() {
		ModelAndView mv = new ModelAndView("InsertMember");
		return mv;
	}

	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student student) {
		int n = dao.studentInsert(student);
		ModelAndView mv = new ModelAndView("InsertMember");
		if (n > 0) {
			mv.addObject("Action", "Success");
		} else {
			mv.addObject("Action", "Failure");
		}
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView listIdDelete() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("DeleteMember");
		mv.addObject("IdList", idList);
		return mv;
	}

	@PostMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Student stud) {
		dao.studentDelete(stud);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("DeleteMember");
		mv.addObject("Action", "Success");
		mv.addObject("IdList", idList);

		return mv;
	}
	
	@GetMapping("Update")
	public ModelAndView listIdUpdate() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("UpdateMember");
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("id") int id) {
		Student student = dao.studentFind(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("UpdateMember");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);

		return mv;
	}

	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		List<Integer> idList = dao.idList();
		dao.studentUpdate(stud);
		ModelAndView mv = new ModelAndView("UpdateMember");
		mv.addObject("IdList", idList);
		mv.addObject("Action", "Success");

		return mv;
	}
	
	@GetMapping("Find")
	public ModelAndView listIdFind() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("FindMember");
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@PostMapping("Searching")
	public ModelAndView doSearch(@RequestParam("id") int id) {
		Student student = dao.studentFind(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("FindMember");
		mv.addObject("IdList", idList);
		mv.addObject("student", student);
		mv.addObject("Action", "Success");

		return mv;
	}
	
	@GetMapping("ViewAll")
	public ModelAndView doViewAll() {
		ModelAndView mv = new ModelAndView("ViewAll");
		List<Student> stuList = dao.studentViewAll();
		mv.addObject("students",stuList);
		return mv;
	}
	
	@GetMapping("FetchBatch")
	public ModelAndView doFetchBatch() {
		ModelAndView mv = new ModelAndView("ViewAll");
		List<Student> stuList = dao.studentViewAll();
		mv.addObject("students",stuList);
		return mv;
	}
}
