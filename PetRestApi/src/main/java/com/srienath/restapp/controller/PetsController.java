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

import com.srienath.restapp.model.Pets;
import com.srienath.restapp.serviceimpl.PetsServiceImpl;

@RestController
@RequestMapping("/pets")
@CrossOrigin("*")
public class PetsController {
	@Autowired
	PetsServiceImpl service;
	
	@PostMapping
	public String insertPets(@RequestBody Pets pets)
	{
		String msg="";
		try {
			service.addPet(pets);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Pets getPetById(@PathVariable("id") int id) {
		return service.getPet(id);
	}
	
	@GetMapping("/all")
	public List<Pets> getAllPets() {
		return service.getAllPets();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody Pets pets)
	{
		String msg="";
		try {
			service.updatePet(pets);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deletePetById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deletePet(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIDList(){
		return service.getAllId();
	}
}
