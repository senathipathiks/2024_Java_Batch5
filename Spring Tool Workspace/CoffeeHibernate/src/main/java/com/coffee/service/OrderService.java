package com.coffee.service;

import java.util.List;
import com.coffee.model.Orders;


public interface OrderService {
	public void addOrder(Orders order);
	public Orders getOrder(int id);
	public void delOrd(int id);
	public List<Orders> viewAllOrder();
	public void updOrd(Orders ord);
}
