package com.nandha.restapp.service;

import java.util.List;
import com.nandha.restapp.model.Restaurant;

public interface RestaurantService {

	public Restaurant addRestaurant(Restaurant res);

	public Restaurant getRestaurant(int id);

	public List<Restaurant> getAllRestaurant();

	public Restaurant updateRestaurant(Restaurant res);

	public String deleteRestaurantbyId(int id);
}
