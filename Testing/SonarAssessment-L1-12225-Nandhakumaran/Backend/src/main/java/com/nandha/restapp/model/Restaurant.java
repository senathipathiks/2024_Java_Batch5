package com.nandha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "restaurantId")
	private int restaurantId;

	@Column(name = "name")
	private String name;

	@Column(name = "ratings")
	private int ratings;

	@Column(name = "phnum")
	private long phnum;

	public Restaurant() {
		super();
	}

	public Restaurant(int restaurantId, String name, int ratings, long phnum) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.ratings = ratings;
		this.phnum = phnum;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public long getPhnum() {
		return phnum;
	}

	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}

	
}
