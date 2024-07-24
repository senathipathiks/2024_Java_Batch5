package com.vickee.restapp.controller;

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

import com.vickee.restapp.model.MobileShop;
import com.vickee.restapp.serviceimpl.MobileShopServiceImpl;

@RestController
@RequestMapping("/mobile")
@CrossOrigin("http://localhost:3000/")
public class MobileShopController {
	
	
	MobileShopServiceImpl service;
	
	
	public MobileShopController(MobileShopServiceImpl service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public void addShop(@RequestBody MobileShop shop) {
		service.addMobileShop(shop);
	}
	@GetMapping("{id}")
	public MobileShop getShop(@PathVariable int id) {
		return service.getMobileShop(id);
	}
	@GetMapping("/allshop")
	public List<MobileShop> getAllShopKeeper(){
		return service.getAllMobileShop();
	}
	@DeleteMapping("{id}")
	public void deleteShop(@PathVariable int id) {
		service.deleteMobileShop(id);
	}
	@PutMapping
	public void updateShopKeeper(@RequestBody MobileShop shop)
	{
		service.updateMobileShop(shop);
	}

}
