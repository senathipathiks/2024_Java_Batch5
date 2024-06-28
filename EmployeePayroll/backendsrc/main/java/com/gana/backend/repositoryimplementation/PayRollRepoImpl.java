package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gana.backend.model.PayRoll;
import com.gana.backend.repository.PayRollRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PayRollRepoImpl implements PayRollRepo {
	
	@Autowired
	EntityManager entityManager;

	 @Override
	    public void save(PayRoll payroll) {
	        entityManager.persist(payroll);
	    }
	 
	    @Override
	    public PayRoll findById(int payrollid) {
	        return entityManager.find(PayRoll.class, payrollid);
	    }
	 
	    @Override
	    public List<PayRoll> findAll() {
	        return entityManager.createQuery("from PayRoll", PayRoll.class).getResultList();
	    }
	 
	    @Override
	    public void update(PayRoll payroll) {
	        entityManager.merge(payroll);
	    }
	 
	    @Override
	    public void deleteById(int payrollid) {
	        PayRoll payroll = entityManager.find(PayRoll.class, payrollid);
	        if (payroll != null) {
	            entityManager.remove(payroll);
	        }
	    }
}
