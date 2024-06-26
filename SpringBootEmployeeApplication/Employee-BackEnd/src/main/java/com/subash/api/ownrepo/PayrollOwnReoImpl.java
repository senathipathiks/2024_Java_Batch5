package com.subash.api.ownrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subash.api.model.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PayrollOwnReoImpl implements PayrollOwnRep {

	@Autowired
	EntityManager entityManager;
	 @Override
	    public void save(Payroll payroll) {
	        entityManager.persist(payroll);
	    }
	 
	    @Override
	    public Payroll findById(int id) {
	        return entityManager.find(Payroll.class, id);
	    }
	 
	    @Override
	    public List<Payroll> findAll() {
	        return entityManager.createQuery("from Payroll", Payroll.class).getResultList();
	    }
	 
	    @Override
	    public void update(Payroll payroll) {
	        entityManager.merge(payroll);
	    }
	 
	    @Override
	    public void deleteById(int id) {
	        Payroll payroll = entityManager.find(Payroll.class, id);
	        if (payroll != null) {
	            entityManager.remove(payroll);
	        }
	    }

}
