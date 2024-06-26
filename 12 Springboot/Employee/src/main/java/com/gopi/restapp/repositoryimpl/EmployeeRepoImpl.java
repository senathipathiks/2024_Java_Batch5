package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Employee;
import com.gopi.restapp.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	EntityManager entityM;
	
	@Override
	public void save(Employee emp) {
		entityM.merge(emp);
	}

	@Override
	public Employee findById(int id) {
		return entityM.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		String jpql = "SELECT e FROM Employee e";
        TypedQuery<Employee> query = entityM.createQuery(jpql, Employee.class);
		return query.getResultList();
	}

	@Override
	public void update(Employee emp) {
		entityM.merge(emp);
	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM Employee WHERE id = " + id;
		entityM.createQuery(jpql).executeUpdate();  // not id only object
	}
}
