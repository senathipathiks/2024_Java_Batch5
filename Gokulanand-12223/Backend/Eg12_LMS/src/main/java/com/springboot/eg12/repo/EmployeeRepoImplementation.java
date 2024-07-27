package com.springboot.eg12.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.eg12.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImplementation implements EmployeeRepo
{
	EntityManager manager;

	public EmployeeRepoImplementation(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void save(Employee employee) 
	{
		manager.persist(employee);
	}

	@Override
	public List<Employee> findAllEmployees() 
	{
		String str = "From Employee";
		Query query = manager.createQuery(str); 
		return query.getResultList();
	}

	@Override
	public void update(Employee employee) 
	{
		manager.merge(employee);
	}

	@Override
	public void deleteById(int emp_id) 
	{
		Employee emp = manager.find(Employee.class, emp_id);
		manager.remove(emp);
	}

	@Override
	public Employee findById(int emp_id) 
	{
		return manager.find(Employee.class, emp_id);
	}

}
