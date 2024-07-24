package com.shp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shp.bean.Meet;
import com.shp.dao.MeetDao;

@Controller
//@ComponentScan(basePackages = "com.shp.controller")
public class MeetController {

	@Autowired
	MeetDao dao;


	@GetMapping("Home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@GetMapping("Links")
	public ModelAndView links() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@GetMapping("Insert")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView delete() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList", idList);
		return mv;
	}
	@GetMapping("Find")
	public ModelAndView listIdFind() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList", idList);
		return mv;
		
	}
	
	@GetMapping("FindName")
	public ModelAndView listNameFind() {
		List<String> nameList = dao.nameList();
		ModelAndView mv = new ModelAndView("FindName");
		mv.addObject("NameList", nameList);
		return mv;
		
	}

	@GetMapping("Update")
	public ModelAndView update() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		return mv;
	}

	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Meet meet) {
		int n = dao.meetInsert(meet);
		ModelAndView mv = new ModelAndView("Insert");

		if (n > 0) {
			mv.addObject("Action", "Success");
		} else {
			mv.addObject("Action", "Failure");
		}
		return mv;
	}

	
	
	@PostMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Meet meet) {

		dao.meetDelete(meet);
		List<Integer> idList = dao.idList();

		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action","Success");
		mv.addObject("IdList", idList);

		return mv;
	}
	
	
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("bookingid") int id) {
		Meet meet = dao.meetFind(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("meet", meet);
 
		return mv;
	}
	
	
 
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Meet stud) {
		List<Integer> idList = dao.idList();
		dao.meetUpdate(stud);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList", idList);
		mv.addObject("Action", "Success");
 
		return mv;
	}
	
	@PostMapping("Searching")
	public ModelAndView doSearch(@RequestParam("bookingid") int id) {
		Meet meet = dao.meetFind(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList", idList);
		mv.addObject("meet", meet);
		mv.addObject("Action", "Success");
 
		return mv;
	}
	
	@PostMapping("SearchingName")
	public ModelAndView doSearchName(@RequestParam("meetUserName") String name) {
		Meet meet = dao.meetFindName(name);
		List<String> nameList = dao.nameList();
		ModelAndView mv = new ModelAndView("FindName");
		mv.addObject("NameList", nameList);
		mv.addObject("meet", meet);
		mv.addObject("Action", "Success");
 
		return mv;
	}
	
	@GetMapping("Display")
	public ModelAndView doDisplay() {
		ModelAndView mv = new ModelAndView("Display");
		List<Meet> metList = dao.meetDisplay();
		mv.addObject("meets",metList);
		return mv;
	}

}
