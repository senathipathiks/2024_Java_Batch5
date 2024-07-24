package com.aravind.sonar.repositoryimpl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.aravind.sonar.model.Order;
import com.aravind.sonar.repository.OrderRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepoImpl implements OrderRepo {
	
	
	EntityManager em;
	

	public OrderRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	
	public void save(Order order) {
		em.persist(order);
		
	}

	
	public List<Order> findAllOrders() {
		String hql = "from Order";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	
	public List<Integer> getIdList() {
		String hql = "select oid from Order";
		
		Query q = em.createQuery(hql);
		return q.getResultList();
	}

	
	public void update(Order order) {
		em.merge(order);
		
	}

	
	public void delete(int oid) {
		Order id = em.find(Order.class, oid);
		em.remove(id);
		
	}

	
	public Order findById(int oid) {
		return em.find(Order.class, oid);
	}
	

}
