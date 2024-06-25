package com.srienath.restapp.controller;

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

import com.srienath.restapp.model.PetShop;
import com.srienath.restapp.serviceimpl.PetShopServiceImpl;

@RestController
@RequestMapping("/petShop")
@CrossOrigin("*")
public class PetShopController {
	@Autowired
	PetShopServiceImpl service;
	
	@PostMapping
	public String insertPetshop(@RequestBody PetShop petshop)
	{
		String msg="";
		try {
			service.addPetShop(petshop);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public PetShop getPetShopById(@PathVariable("id") int id) {
		return service.getPetShop(id);
	}
	
	@GetMapping("/all")
	public List<PetShop> getAllPetShops() {
		return service.getAllPetShops();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody PetShop petshop)
	{
		String msg="";
		try {
			service.updatePetShop(petshop);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deletePetShopById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deletePetShop(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
}
