package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDao;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeDao dao;
   @GetMapping("Banner")
   public ModelAndView loadBanner()
   {
	   ModelAndView mv=new ModelAndView("Banner");
	   return mv;
   }
   
   @GetMapping("Links")
   public ModelAndView loadLinks()
   {
	   ModelAndView mv=new ModelAndView("Links");
	   return mv;
   }
   
   @GetMapping("Insert")
   public ModelAndView loadInsert()
   {
	   ModelAndView mv=new ModelAndView("Insert");
	   mv.addObject("Action",null);
	   return mv;
   }
   
   @PostMapping("Insertion")
   public ModelAndView doInsert(@ModelAttribute("bean")Employee Empl)
   {
	   int n=dao.insertEmployee(Empl);
	   ModelAndView mv=new ModelAndView("Insert");
	   if(n>0)
	   {
		   mv.addObject("Action","Success"); 
	   }
	   else
	   {
		   mv.addObject("Action","Failure");
	   }
	   
	   return mv;
   }
   
   @RequestMapping("Delete")
	public ModelAndView loadDelete() {
		List<Integer> idList=dao.idList();
		ModelAndView mv=new ModelAndView("Delete");
//		for (Integer integer : idList) {
//			System.out.println(integer);
//		}
		mv.addObject("idList", idList);
		return mv;
	}
   
    @PostMapping("Deletion")
    public ModelAndView doDelete(@ModelAttribute("bean")Employee Empl)
    {
    	dao.deleteEmployee(Empl);
    	List<Integer> idList=dao.idList();
    	
    	ModelAndView mv=new ModelAndView("Delete");
    	mv.addObject("Action","Success");
    	mv.addObject("idList",idList);
    	return mv;
    }
    
    @RequestMapping("Update")
    	public ModelAndView loadUpdate() {
    		List<Integer> idList= dao.idList();
    		ModelAndView mv=new ModelAndView("Update");
    		mv.addObject("idList", idList);
    		return mv;
    	}
    	
    	@RequestMapping("Fetch")
    	public ModelAndView doFetch(@RequestParam("eid") int id) {
    		Employee emp= dao.fetchOne(id);
    		List<Integer> idList= dao.idList();
    		ModelAndView mv=new ModelAndView("Update");
    		mv.addObject("Empl", emp);
    		mv.addObject("idList", idList);
    		return mv;
    	}
    	
    	@PostMapping("Updation")
    public ModelAndView doUpdate(@ModelAttribute("bean") Employee Empl) {
    		
//    		int id= Integer.parseInt(req.getParameter("sid"));
//    		String name = req.getParameter("sname");
//    		String city = req.getParameter("scity");
//    		
//    		Student stud=new Student(id,name,city);
    				
//    		System.out.println(stud.getSId());
    		
    	
    		
    		List<Integer> idList=dao.idList();
    		dao.updateEmployee(Empl);
    		ModelAndView mv=new ModelAndView("Update");
    		mv.addObject("Action", "Success");
    		mv.addObject("IdList", idList);
    		return mv;
    	}
    	
    	@RequestMapping("ViewAll")
    	public ModelAndView doVieweAll() {
    		List<Employee> emplList= dao.fetchAll();
     
    		ModelAndView mv=new ModelAndView("ViewAll");
    		mv.addObject("Empllist", emplList);
    		
    		return mv;
    	}
    }

