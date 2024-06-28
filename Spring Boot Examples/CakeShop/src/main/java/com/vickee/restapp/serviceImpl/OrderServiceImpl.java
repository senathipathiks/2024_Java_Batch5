package com.vickee.restapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Order;
import com.vickee.restapp.repository.OrderRepo;
import com.vickee.restapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo repo;
	@Override
	public void addOrder(Order ord) {
		// TODO Auto-generated method stub
		repo.save(ord);
		
		
	}

}
