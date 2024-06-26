package com.ars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ars.bean.Flight;
import com.ars.dao.FlightDao;




@Controller
public class FlightController {
	
	@Autowired
	FlightDao dao;
	
	@GetMapping("Banner")
	public ModelAndView LoadBanner() {
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}
	@GetMapping("Links")
	public ModelAndView LoadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	//-----------------------------------------------------------------------------------------
	@GetMapping("Insert")
	public ModelAndView LoadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Flight f) {
		int n = dao.insertFlight(f);
		ModelAndView mv = new ModelAndView("Insert");
		if(n>0) {
			mv.addObject("Action","Success");
		} else {
			mv.addObject("Action","Failure");
		}
		
		return mv;
	}
	
	//update
	//Update
		@RequestMapping("update")
		public ModelAndView loadUpdate() {
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("update");
			
			mv.addObject("idList",idList);
			return mv;
		}
		
		@RequestMapping("Fetch")
		public ModelAndView doFetch(@RequestParam("flightId") int id) {
			
			Flight f = dao.fetchOne(id);
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("update");
			
			mv.addObject("f",f);
			mv.addObject("idList",idList);
			return mv;
		}
		
		@PostMapping("Updation")
		public ModelAndView doUpdate(@ModelAttribute("bean") Flight f) {
			dao.updateFlight(f);
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("update");

			mv.addObject("Action","Success");
			mv.addObject("idList" ,idList);
			return mv;
			
		}
		
		//delete
		@RequestMapping("delete")
		public ModelAndView loadDelete() {
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("delete");
			mv.addObject("idList",idList);
			return mv;
		}
		
		@PostMapping("Deletion")
		public ModelAndView doDelete(@ModelAttribute("bean") Flight f) {
			dao.deleteFlight(f);
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("delete");
			
			mv.addObject("Action","Success");
			mv.addObject("idList" ,idList);
			return mv;
			
		}
		

		//viewall
		@RequestMapping("viewall")
		public ModelAndView doViewAll() {
			List<Flight> flightlist = dao.fetchAll();
			ModelAndView mv = new ModelAndView("viewall");
			mv.addObject("flightlist",flightlist);
			return mv;
		}
		
		
		//find by id
		@RequestMapping("find")
		public ModelAndView loadFind() {
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("find");
			
			mv.addObject("idList",idList);
			return mv;
		}
		@RequestMapping("Fetch1")
		public ModelAndView doFetch1(@RequestParam("FlightId") int id) {
			
			Flight f = dao.fetchOne(id);
			List<Integer> idList = dao.idList();
			ModelAndView mv = new ModelAndView("find");
			
			mv.addObject("f",f);
			mv.addObject("idList",idList);
			return mv;
		}
		//find by name
				@RequestMapping("findname")
				public ModelAndView loadFind1() {
					List<String> nameList = dao.nameList();
					ModelAndView mv = new ModelAndView("findname");
					
					mv.addObject("nameList",nameList);
					return mv;
				}
				@RequestMapping("Fetch2")
				public ModelAndView doFetch1(@RequestParam("FlightName") String name) {
					
					Flight f = dao.fetchOneName(name);
					List<String> nameList = dao.nameList();
					ModelAndView mv = new ModelAndView("findname");
					
					mv.addObject("f",f);
					mv.addObject("nameList",nameList);
					return mv;
				}
		
	

}
