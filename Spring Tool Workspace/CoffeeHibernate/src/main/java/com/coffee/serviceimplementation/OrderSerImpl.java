package com.coffee.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coffee.model.Orders;
import com.coffee.repo.OrderRepo;
import com.coffee.service.OrderService;

@Service
public class OrderSerImpl implements OrderService{

	OrderRepo repo;
	
	public OrderSerImpl(OrderRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public void addOrder(Orders order) {
		repo.save(order);
	}

	@Override
	public Orders getOrder(int id) {
		return repo.findById(id);
	}

	@Override
	public void delOrd(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Orders> viewAllOrder() {
		return repo.findAll();
	}

	@Override
	public void updOrd(Orders ord) {
		repo.update(ord);
	}
	
	
}
