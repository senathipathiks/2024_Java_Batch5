package com.assessment.App.service;


import java.util.List;

import com.assessment.App.model.Order;


public interface OrderService {

    Order getOrderById(int id);
    void saveOrder(Order order);
    void deleteOrder(int id);
    void updateOrder(Order order);
	List<Order> getAllOrders(); 

}
