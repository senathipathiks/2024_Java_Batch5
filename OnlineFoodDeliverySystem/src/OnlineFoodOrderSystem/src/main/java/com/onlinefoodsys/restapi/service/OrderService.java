package com.onlinefoodsys.restapi.service;

import java.util.List;
import java.util.Optional;

import com.onlinefoodsys.restapi.model.Order;



public interface OrderService {


	public void addorder(Order ord) ;
	
	public Optional<Order> getorder(int id) ;
		
	public List<Order> getall();
	
	public void updateorder(Order ord);
	
	public void deleteorder(int id);
}
