package com.nandha.restapp.serviceimplementatiopn;

import java.util.List;
import org.springframework.stereotype.Service;
import com.nandha.restapp.model.Restaurant;
import com.nandha.restapp.repository.RestaurantRepo;
import com.nandha.restapp.service.RestaurantService;

@Service
public class RestaurantServiceImplementation implements RestaurantService {

	RestaurantRepo repo;

	public RestaurantServiceImplementation(RestaurantRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Restaurant addRestaurant(Restaurant res) {
		return repo.save(res);
	}

	@Override
	public Restaurant getRestaurant(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		return repo.findAll();
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		return repo.save(res);
	}

	@Override
	public String deleteRestaurantbyId(int id) {
		repo.deleteById(id);
		return null;
	}

}
