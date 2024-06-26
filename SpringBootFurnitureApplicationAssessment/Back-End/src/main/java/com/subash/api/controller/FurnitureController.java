package com.subash.api.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subash.api.model.Furniture;
import com.subash.api.serviceimpl.FurnitureServiceImpl;

@RestController
@RequestMapping("/furniture")
@CrossOrigin("http://localhost:3000")
public class FurnitureController {

	
	FurnitureServiceImpl service;

	public FurnitureController(FurnitureServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertFurniture(@RequestBody Furniture furniture) {
		String msg = "";

		try {
			service.addFurniture(furniture);
			msg += "addSuccess";

		} catch (Exception e) {
			msg += "addFailure";
		}
		return msg;
		 
	        
	}

	@PutMapping
	public String updateFurniture(@RequestBody Furniture furniture) {
		String msg = "";

		try {

			service.updateFurniture(furniture);
			msg += "updateSuccess";

		} catch (Exception e) {
			msg += "updateFailure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Furniture getFurnitureById(@PathVariable("id") int id) {
		return service.getFurniture(id);
	}

	@GetMapping("/all")
	public List<Furniture> getFurniture() {
		return service.getAllFurniture();
	}

	@DeleteMapping("{id}")
	public String deleteFurnitureById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deleteFurniture(id);
			msg += "deleteSuccess";

		} catch (Exception e) {
			msg += "deleteFailure";
		}
		return msg;

	}
}
