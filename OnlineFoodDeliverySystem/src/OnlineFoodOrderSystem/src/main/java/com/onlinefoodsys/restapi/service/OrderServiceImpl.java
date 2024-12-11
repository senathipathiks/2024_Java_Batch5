package com.onlinefoodsys.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefoodsys.restapi.model.Order;
import com.onlinefoodsys.restapi.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{
@Autowired
OrderRepo repo;
	
	public void addorder(Order ord) {
		repo.save(ord);
	}

	
	public Optional<Order> getorder(int id) {
		return repo.findById(id);
	}

	
	public List<Order> getall() {
		return repo.findAll();
	}

	
	public void updateorder(Order ord) {
		repo.save(ord);
	}

	
	
	
	public void deleteorder(int id) {
		repo.deleteById(id);
	}

}
