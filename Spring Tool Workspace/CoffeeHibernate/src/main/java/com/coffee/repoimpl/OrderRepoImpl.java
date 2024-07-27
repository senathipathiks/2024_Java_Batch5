package com.coffee.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.model.Orders;
import com.coffee.repo.OrderRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepoImpl implements OrderRepo{

	@Autowired
	EntityManager emanager;
	
	@Override
	public void save(Orders order) {
		emanager.persist(order);		
	}

	@Override
	public Orders findById(int id) {
		return emanager.find(Orders.class, id);
		
	}

	@Override
	public void deleteById(int id) {
		Orders o = emanager.find(Orders.class, id);
		emanager.remove(o);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> findAll() {
		String hql = "from Orders";
		Query q = emanager.createQuery(hql);
		return q.getResultList();
	}

	@Override
	public void update(Orders ord) {
		emanager.merge(ord);		
	}
	
}
