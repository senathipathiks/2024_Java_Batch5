package com.velan.restapp.repositoryimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Employee;
import com.velan.restapp.model.Payroll;
import com.velan.restapp.repository.PayrollRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PayrollRepoImp implements PayrollRepo {

	@Autowired
	EntityManager em;

	@Override
	public void save(Payroll pay) {
		em.persist(pay);
	}

	@Override
	public List<Payroll> findAllPayrolls() {

		String hql = "from Payroll";
		Query query = em.createQuery(hql);
		return query.getResultList();

	}

	@Override
	public List<Integer> getIdList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payroll findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Payroll.class, id);
	}

	@Override
	public void update(Payroll pay) {
		// TODO Auto-generated method stub
		em.merge(pay);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Payroll p = em.find(Payroll.class, id);
		em.remove(p);
	}

}
