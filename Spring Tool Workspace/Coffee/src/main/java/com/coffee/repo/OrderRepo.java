package com.coffee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer>{
	public void deleteById(int id);
}
