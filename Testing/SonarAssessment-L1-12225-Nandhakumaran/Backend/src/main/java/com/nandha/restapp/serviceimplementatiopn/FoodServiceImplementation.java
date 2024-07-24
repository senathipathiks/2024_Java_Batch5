package com.nandha.restapp.serviceimplementatiopn;

import java.util.List;
import org.springframework.stereotype.Service;
import com.nandha.restapp.model.Food;
import com.nandha.restapp.repository.FoodRepo;
import com.nandha.restapp.service.FoodService;

@Service
public class FoodServiceImplementation implements FoodService {

	FoodRepo repo;

	public FoodServiceImplementation(FoodRepo repo) {
		super();
		this.repo = repo;
	}

	public Food addFood(Food fd) {
		return repo.save(fd);
	}

	@Override
	public Food getFood(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Food> getAllFood() {
		return repo.findAll();
	}

	public Food updateFood(Food fd) {
		return repo.save(fd);
	}

	public String deleteFoodById(int id) {
		repo.deleteById(id);
		return null;
	}
}
