package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.FIR;
import com.gopi.restapp.repository.FIRRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FIRRepoImpl implements FIRRepo {

	@Autowired
	EntityManager entityM;
	
	@Override
	public void save(FIR fir) {
		entityM.merge(fir);
	}

	@Override
	public FIR findById(int id) {
		return entityM.find(FIR.class, id);
	}

	@Override
	public List<FIR> findAll() {
		String jpql = "SELECT e FROM FIR e";
        TypedQuery<FIR> query = entityM.createQuery(jpql, FIR.class);
		return query.getResultList();
	}

	@Override
	public void update(FIR fir) {
		entityM.merge(fir);
	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM FIR WHERE firid = " + id;
		entityM.createQuery(jpql).executeUpdate();  // not id only object
	}
}
