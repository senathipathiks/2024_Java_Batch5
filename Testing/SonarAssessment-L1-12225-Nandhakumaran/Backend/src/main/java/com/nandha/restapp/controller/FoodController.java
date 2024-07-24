package com.nandha.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nandha.restapp.model.Food;
import com.nandha.restapp.service.FoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:3001,http://localhost:3000,http://localhost:3002,http://localhost:3003")
@RestController
@RequestMapping("/food")
public class FoodController {

	FoodService service;

	public FoodController(FoodService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public Food insertFood(@RequestBody Food fd) {

		return service.addFood(fd);
	}

	@GetMapping("{id}")
	public Food getFoodById(@PathVariable("id") int id) {
		return service.getFood(id);
	}

	@GetMapping("/all")
	public List<Food> viewAllFood() {
		return service.getAllFood();
	}

	@PutMapping
	public Food updateFood(@RequestBody Food fd) {

		return service.updateFood(fd);
	}

	@DeleteMapping("{id}")
	public String deleteFoodById(@PathVariable("id") int id) {

		return service.deleteFoodById(id);
	}
}
