package com.supraja.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.supraja.restapp.model.CollegeEvent;
import com.supraja.restapp.repository.CollegeEventRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class CollegeEventRepoimpl implements CollegeEventRepo {
	EntityManager entitymanager;

	public CollegeEventRepoimpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Integer> getIDList() {
		String jpql = "Select c.eid from CollegeEvent c";
		TypedQuery<Integer> query = entitymanager.createQuery(jpql, Integer.class);
		return query.getResultList();

	}

	@Override
	public void save(CollegeEvent event) {

		entitymanager.merge(event);
	}

	@Override
	public List<CollegeEvent> findAll() {
		String jpql = "select c from CollegeEvent c";
		TypedQuery<CollegeEvent> query = entitymanager.createQuery(jpql, CollegeEvent.class);
		return query.getResultList();

	}

	@Override
	public void deleteById(int eid) {
		String jpql = "delete from CollegeEvent where eid=" + eid;
		entitymanager.createQuery(jpql).executeUpdate();

	}

	@Override
	public CollegeEvent findById(int eid) {

		return entitymanager.find(CollegeEvent.class, eid);
	}

}
