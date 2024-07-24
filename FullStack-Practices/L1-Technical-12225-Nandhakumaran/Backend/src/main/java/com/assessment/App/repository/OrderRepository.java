package com.assessment.App.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.assessment.App.model.Order;

import jakarta.transaction.Transactional;

@Repository
public interface OrderRepository {
	
	 Order findOById(int id);
	    void saveO(Order order);
	    void deleteO(int id);
	    void updateO(Order order);
		List<Order> findAllOrders(); 
    
}
