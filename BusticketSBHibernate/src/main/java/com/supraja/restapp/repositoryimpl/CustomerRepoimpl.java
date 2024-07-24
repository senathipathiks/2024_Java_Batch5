package com.supraja.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.supraja.restapp.model.Customer;
import com.supraja.restapp.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class CustomerRepoimpl implements CustomerRepo {
	EntityManager entitymanager;
	

	public CustomerRepoimpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Integer> getIDList() {
		String jpql="Select c.id from Customer c";
		TypedQuery<Integer> query = entitymanager.createQuery(jpql,Integer.class);
		return query.getResultList();
		
	}

	@Override
	public void save(Customer customer) {
       		
		entitymanager.merge(customer);
	}

	@Override
	public List<Customer> findAll() {
		String jpql="select c from Customer c";
		TypedQuery<Customer> query = entitymanager.createQuery(jpql,Customer.class);
		return query.getResultList();
		
	}

	@Override
	public void deleteById(int id) {
		String jpql="delete from Customer where id=" +id;
		entitymanager.createQuery(jpql).executeUpdate();

	}

	@Override
	public Customer findById(int id) {
		
		return entitymanager.find(Customer.class, id);
	}

}
