package com.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tms.bean.Tender;
import com.tms.dao.TenderDao;

import antlr.collections.List;

@Controller
//@ComponentScan(basePackages = {"com.tms.controller"})
public class TenderController {
	
//	@Autowired
	TenderDao dao = new TenderDao();
	
	@GetMapping("/Title")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView("Title");
		return mv;
	}
	
	@GetMapping("/Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}
	
	@GetMapping("/Buttons")
	public ModelAndView loadButtons() {
		ModelAndView mv = new ModelAndView("Buttons");
		return mv;
	}
	
	@GetMapping("/Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@PostMapping("/Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Tender tend) {
		int n = dao.insertTender(tend);
		ModelAndView mv = new ModelAndView("Insert");
		if(n>0) {
			mv.addObject("Action","Success");
		}
		else {
			mv.addObject("Action","Failure");
		}
		return mv;
	}
	
	@RequestMapping("Delete")
		public ModelAndView loaddoDelete() {
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Delete");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@PostMapping("Deletion")
		public ModelAndView doDelete(@ModelAttribute("bean") Tender tend) {
			dao.tenderDelete(tend);
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Delete");
			mv.addObject("Action","Success");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@RequestMapping("Update")
		public ModelAndView loadUpdate() {
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@RequestMapping("Fetch")
		public ModelAndView loaddoFetch(@RequestParam("tid") int id) {
			Tender tend = dao.fetchOne(id);
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("tendfetch",tend);
			return mv;
		}
		
		@PostMapping("Updation")
		public ModelAndView doUpdate(@ModelAttribute("bean") Tender tend) {
			dao.updateTender(tend);
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Update");
			mv.addObject("Action","Success");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@RequestMapping("ViewAll")
		public ModelAndView loadViewAll() {
			java.util.List<Tender> TenderList = dao.fetchAll();
			ModelAndView mv = new ModelAndView("ViewAll");
			mv.addObject("TendList",TenderList);
			return mv;
		}
		
		@RequestMapping("Find")
		public ModelAndView loadFind() {
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("IdList",idList);
			return mv;
		}
		
		@RequestMapping("FetchFind")
		public ModelAndView loaddoFetchfind(@RequestParam("tid") int id) {
			Tender tend = dao.fetchOne(id);
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("tendfind",tend);
			return mv;
		}
		
		@PostMapping("Finding")
		public ModelAndView dofinding(@ModelAttribute("bean") Tender tend) {
			dao.findten(tend);
			java.util.List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("Find");
			mv.addObject("TendfindList",idList);
			return mv;
		}
}
