package com.aravind.sonar.repository;

import java.util.List;

import com.aravind.sonar.model.Order;


public interface OrderRepo  {
	
	public void save(Order order);
	public void update(Order order);
	public void delete(int oid);
	
    public List<Order> findAllOrders();

	public List<Integer> getIdList();

    public Order findById(int oid);

}
