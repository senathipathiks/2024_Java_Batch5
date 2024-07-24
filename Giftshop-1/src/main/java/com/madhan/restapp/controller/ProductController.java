package com.madhan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhan.restapp.model.Product;
import com.madhan.restapp.serviceimpl.ProductServiceimpl;

@RestController
@RequestMapping("/producttable")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	ProductServiceimpl service;
	
	@PostMapping
	public String insertProduct(@RequestBody Product pdt)
	{
		String msg="";
		try {
			service.addProduct(pdt);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	@GetMapping("{id}")
	public Product getProductById(@PathVariable("id") int id)
	{
	return service.getProduct(id);
}
	

	
	
	@GetMapping("/all")
	public List<Product> getProduct()
	{
	return service.getAllProduct();
}
	
	@PutMapping
	public String updateProduct(@RequestBody Product pdt)
	{
		String msg="";
		try {
			service.updateProduct(pdt);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteProduct(@PathVariable("id") int  id)
	{
		String msg="";	
		try {
			service.deleteProduct(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
}
