package com.nandha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nandha.restapp.model.Food;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {

}
