package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Payroll;
import com.gopi.restapp.repository.PayrollRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PayrollRepoImpl implements PayrollRepo{

	@Autowired
	EntityManager entityM;
	
	@Override
	public List<Integer> fetchId() {
		String jpql = "SELECT p.pid FROM Payroll p";
        TypedQuery<Integer> query = entityM.createQuery(jpql,Integer.class);
		return query.getResultList();
		
	}

	@Override
	public Payroll findById(int id) {
		return entityM.find(Payroll.class, id);
	}

	@Override
	public List<Payroll> findAll() {
		String jpql = "SELECT p FROM Payroll p";
        TypedQuery<Payroll> query = entityM.createQuery(jpql,Payroll.class);
		return query.getResultList();
	}

	@Override
	public void update(Payroll payroll) {
		entityM.merge(payroll);
		
	}

	@Override
	public void save(Payroll payroll) {
		entityM.merge(payroll);
		
	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM Payroll WHERE id = " + id;
		entityM.createQuery(jpql).executeUpdate();
	}

}
