package com.nsms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nsms.bean.Product;
import com.nsms.dao.ProductDAO;

@Controller
//@ComponentScan(basePackages= {"com.sms.controller","com.sms.dao"})
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@GetMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView("Banner");
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
		mv.addObject("Action",null);
		return mv;
	}
	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Product prod) {
		int n=dao.insertStudent(prod);

		ModelAndView mv = new ModelAndView("Insert");
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
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Product prod) {
		List<Integer> idList = dao.idList();
		dao.deleteStudent(prod);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action","Success");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@RequestMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("prodID") int id) {
		Product prod=dao.fetchOne(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Prod",prod);

		mv.addObject("IdList",idList);
		return mv;
	}
	@PostMapping("Updation")
	public ModelAndView doUpdate(HttpServletRequest req) {
		int id= Integer.parseInt(req.getParameter("prodID"));
		String name = req.getParameter("prodName");
		double price = Double.parseDouble(req.getParameter("price"));
		String prodType = req.getParameter("prodType");
		String prodStatus = req.getParameter("prodStatus");
		int stockLeft = Integer.parseInt(req.getParameter("stockLeft"));

		Product prod=new Product(id,name,price,prodType,prodStatus,stockLeft);
				
		System.out.println(prod.getProdID());
		List<Integer> idList=dao.idList();
		
		dao.updateStudent(prod);
		ModelAndView mv=new ModelAndView("Update");
		mv.addObject("Action", "Success");
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("ViewAll")
	public ModelAndView doViewAll() {
		List<Product> prodlist = dao.fetchAll();
		ModelAndView mv = new ModelAndView("ViewAll");
		mv.addObject("prodList",prodlist);
		return mv;
	}
	
	@RequestMapping("FindById")
	public ModelAndView loadFind() {
		List<Integer> idList = dao.idList();
		ModelAndView mv= new ModelAndView("FindById");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("Fetch1")
	public ModelAndView doFetch1(@RequestParam("prodID") int id) {
		Product prod= dao.fetchOne(id);
		List<Integer> idList = dao.idList();
		ModelAndView mv= new ModelAndView("FindById");
		mv.addObject("Prod",prod);
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@RequestMapping("FindByName")
	public ModelAndView loadUpdateByName() {
		List<String> nameList= dao.nameList();
		ModelAndView mv=new ModelAndView("FindByName");
		mv.addObject("nameList", nameList);
		return mv;
	}
	
	@RequestMapping("Fetch2")
	public ModelAndView doFetch(@RequestParam("prodName") String name) {
		Product prod= dao.fetchName(name);
		List<String> nameList= dao.nameList();
		ModelAndView mv=new ModelAndView("FindByName");
		mv.addObject("Prod", prod);
		mv.addObject("nameList", nameList);
		return mv;
	}
}

