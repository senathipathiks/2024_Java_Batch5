package com.supraja.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.supraja.restapp.model.Booking;
import com.supraja.restapp.repository.BookingRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class BookingRepoimpl implements BookingRepo {
	
	EntityManager entityManager;
	
    //constructor using fields
	public BookingRepoimpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Integer> getIDList() {
		String jpql="Select b.bid from Booking b";
		TypedQuery<Integer> query = entityManager.createQuery(jpql,Integer.class);
		return query.getResultList();
	}

	@Override
	public void save(Booking booking) {
		
		entityManager.merge(booking);
	}

	@Override
	public List<Booking> findAll() {
		String jpql="From Booking";
		TypedQuery<Booking> query = entityManager.createQuery(jpql,Booking.class);
		return query.getResultList();
	}

	@Override
	public void deleteById(int bid) {
		String jpql="delete from Booking where bid=" +bid;
		entityManager.createQuery(jpql).executeUpdate();
	}

	@Override
	public Booking findById(int bid) {
		return entityManager.find(Booking.class, bid);
	}

}
