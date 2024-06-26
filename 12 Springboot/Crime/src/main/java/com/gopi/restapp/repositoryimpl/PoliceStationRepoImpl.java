package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.PoliceStation;
import com.gopi.restapp.repository.PoliceStationRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PoliceStationRepoImpl implements PoliceStationRepo {

	@Autowired
	EntityManager entityM;
	
	@Override
	public List<Integer> fetchId() {
		String jpql = "SELECT p.stationid FROM PoliceStation p";
        TypedQuery<Integer> query = entityM.createQuery(jpql,Integer.class);
		return query.getResultList();
		
	}

	@Override
	public PoliceStation findById(int id) {
		return entityM.find(PoliceStation.class, id);
	}

	@Override
	public List<PoliceStation> findAll() {
		String jpql = "SELECT p FROM PoliceStation p";
        TypedQuery<PoliceStation> query = entityM.createQuery(jpql,PoliceStation.class);
		return query.getResultList();
	}

	@Override
	public void update(PoliceStation policeStation) {
		entityM.merge(policeStation);
		
	}

	@Override
	public void save(PoliceStation policeStation) {
		entityM.merge(policeStation);
		
	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM PoliceStation WHERE stationid = " + id;
		entityM.createQuery(jpql).executeUpdate();
	}
}
