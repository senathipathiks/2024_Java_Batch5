package com.prabha.restapp.repositoryImpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.prabha.restapp.model.Payroll;
import com.prabha.restapp.repository.PayRollRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class PayrollrepoImpl implements PayRollRepo {
	EntityManager entityManager;
	 public PayrollrepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

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

	
