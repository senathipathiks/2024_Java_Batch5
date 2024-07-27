package com.coffee.service;

import java.util.List;
import java.util.Optional;

import com.coffee.model.Orders;


public interface OrderService {
	public void addOrder(Orders order);
	public Optional<Orders> getOrder(int id);
	public void delOrd(int id);
	public List<Orders> viewAllOrder();
	public void updOrd(Orders ord);
}
