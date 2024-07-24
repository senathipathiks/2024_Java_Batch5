package com.supraja.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.supraja.restapp.model.Alumni;
import com.supraja.restapp.repository.AlumniRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class AlumniRepoimpl implements AlumniRepo {

	EntityManager entityManager;

	// constructor using fields
	public AlumniRepoimpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Integer> getIDList() {
		String jpql = "Select a.aid from Alumni a";
		TypedQuery<Integer> query = entityManager.createQuery(jpql, Integer.class);
		return query.getResultList();
	}

	@Override
	public void save(Alumni alumni) {

		entityManager.merge(alumni);
	}

	@Override
	public List<Alumni> findAll() {
		String jpql = "From Alumni";
		TypedQuery<Alumni> query = entityManager.createQuery(jpql, Alumni.class);
		return query.getResultList();
	}

	@Override
	public void deleteById(int aid) {
//		String jpql = "delete from Alumni where aid=" + aid;
//		entityManager.createQuery(jpql).executeUpdate();
		
		Alumni al=entityManager.find(Alumni.class, aid);
		entityManager.remove(al);
	}

	@Override
	public Alumni findById(int aid) {
		return entityManager.find(Alumni.class, aid);
	}

}
