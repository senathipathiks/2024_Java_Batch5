package com.velan.restapp.repositoryimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Employee;
import com.velan.restapp.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImp implements EmployeeRepo {

	@Autowired
	EntityManager em;
	
	@Override
	public void save(Employee employee) {
		em.persist(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id);
	}
	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		em.merge(employee);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee e=em.find(Employee.class,id);
		em.remove(e);
	}
}

