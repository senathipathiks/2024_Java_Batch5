package com.aravind.sonar.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aravind.sonar.model.Order;
import com.aravind.sonar.repository.OrderRepo;
import com.aravind.sonar.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	
	OrderRepo orepo;
	
	static final String SUCCESS = "Success";
	 static final String FAILURE = "Failure";
	

	public OrderServiceImpl(OrderRepo orepo) {
		super();
		this.orepo = orepo;
	}
	
	

	public OrderRepo getOrepo() {
		return orepo;
	}



	public void setOrepo(OrderRepo orepo) {
		this.orepo = orepo;
	}



	@Override
	public String addOrder(Order order) {
		orepo.save(order);
		return SUCCESS;
		
	}

	@Override
	public List<Order> getAllOrder() {
		return orepo.findAllOrders();
	}

	@Override
	public List<Integer> getIdList() {
		return orepo.getIdList();
		
	}

	@Override
	public String updateOrder(Order order) {
		orepo.update(order);
		return SUCCESS;
		
	}

	@Override
	public String deleteOrder(int oid) {
		orepo.delete(oid);
		return SUCCESS;
		
	}


	@Override
	public Order getOrder(int oid) {
		return orepo.findById(oid);
	}
	

}
