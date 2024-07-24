package com.assessment.App.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assessment.App.model.Order;
import com.assessment.App.repository.OrderRepository;
import com.assessment.App.service.OrderService;

@Service
public class OrderServiceImplementation implements OrderService {
	
    private final OrderRepository orderRepo;

    @Autowired
    public OrderServiceImplementation(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }
    
    @Override
    public void saveOrder(Order order) {
    	orderRepo.saveO(order);
	}

	@Override
	public Order getOrderById(int id) {
		
		return orderRepo.findOById(id);
	}

	public List<Order> getAllOrders() {

		return orderRepo.findAllOrders();
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
		orderRepo.updateO(order);

	}
	
	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		orderRepo.deleteO(id);

	}

	

}


