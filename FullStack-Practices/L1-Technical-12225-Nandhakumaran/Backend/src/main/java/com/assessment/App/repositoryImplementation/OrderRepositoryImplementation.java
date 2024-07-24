package com.assessment.App.repositoryImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assessment.App.model.Order;
import com.assessment.App.repository.OrderRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepositoryImplementation implements OrderRepository {
	
	@Autowired
	EntityManager eManager;
	
	@Override
	public void saveO(Order order) {
		// TODO Auto-generated method stub
		eManager.persist(order);
	}
	@Override
	public List<Order> findAllOrders() {
		String hql = "from Order";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	@Override
	public Order findOById(int id) {
		// TODO Auto-generated method stub
		return eManager.find(Order.class, id);
	}
	@Override
	public void updateO(Order order) {
		// TODO Auto-generated method stub
		eManager.merge(order);
	}
	@Override
	public void deleteO(int id) {
		Order orderToDelete = findOById(id);
	    if (orderToDelete != null) {
	        eManager.remove(orderToDelete);
	    }
}
	

}
