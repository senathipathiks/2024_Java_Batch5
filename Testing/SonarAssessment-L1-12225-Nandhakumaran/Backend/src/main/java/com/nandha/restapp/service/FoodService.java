package com.nandha.restapp.service;

import java.util.List;
import com.nandha.restapp.model.Food;

public interface FoodService {

	public Food addFood(Food fd);

	public Food getFood(int id);

	public List<Food> getAllFood();

	public Food updateFood(Food fd);

	public String deleteFoodById(int id);
}
