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

import com.madhan.restapp.model.Shop;
import com.madhan.restapp.serviceimpl.ShopServiceimpl;

@RestController
@RequestMapping("/shop")
@CrossOrigin("*")
public class ShopController {

	
	@Autowired
	ShopServiceimpl service;
	
	@PostMapping
	public String insertShop(@RequestBody Shop shp)
	{
		String msg="";
		try {
			service.addShop(shp);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	@GetMapping("{id}")
	public Shop getShopById(@PathVariable("id") int id)
	{
	return service.getShop(id);
}
	
	@GetMapping("/all")
	public List<Shop> getShop()
	{
	return service.getAllShop();
}
	
	@PutMapping
	public String updateShop(@RequestBody Shop shp)
	{
		String msg="";
		try {
			service.updateShop(shp);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteShop(@PathVariable("id") int  id)
	{
		String msg="";
		try {
			service.deleteShop(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	
}
