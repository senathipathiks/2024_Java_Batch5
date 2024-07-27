package com.SpringBoot.Eg9.Repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg9.Model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImplementation implements EmployeeRepo{
	
	public EmployeeRepoImplementation(EntityManager eManager) {
		super();
		this.eManager = eManager;
	}
	EntityManager eManager;
	
	@Override
	public void save(Employee employee) {
		eManager.persist(employee);
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query =eManager.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		return eManager.find(Employee.class, id);
	}
	@Override
	public void update(Employee employee) {
		eManager.merge(employee);
	}
	@Override
	public void delete(int id) {
		Employee employee = eManager.find(Employee.class, id);
		eManager.remove(employee);
	}
}