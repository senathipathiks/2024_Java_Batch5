package com.nandha.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nandha.restapp.model.Restaurant;
import com.nandha.restapp.service.RestaurantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:3001,http://localhost:3000,http://localhost:3002,http://localhost:3003")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	RestaurantService service;

	public RestaurantController(RestaurantService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public Restaurant insertRestaurant(@RequestBody Restaurant res) {

		return service.addRestaurant(res);
	}

	@GetMapping("{id}")
	public Restaurant getRestaurantById(@PathVariable("id") int id) {
		return service.getRestaurant(id);
	}

	@GetMapping("/all")
	public List<Restaurant> viewAllRestaurant() {
		return service.getAllRestaurant();
	}

	@PutMapping
	public Restaurant updateRestaurant(@RequestBody Restaurant res) {

		return service.updateRestaurant(res);
	}

	@DeleteMapping("{id}")
	public String deleteRestaurantById(@PathVariable("id") int id) {

		return service.deleteRestaurantbyId(id);
	}
}
