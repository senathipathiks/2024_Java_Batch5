package com.aravind.sonar.service;

import java.util.List;

import com.aravind.sonar.model.Order;

public interface OrderService  {

	
    public String addOrder(Order order);
    public String updateOrder(Order order);
	public String deleteOrder(int oid);
	public List<Order> getAllOrder();
	public List<Integer> getIdList();
	public Order getOrder(int oid);
	
}
