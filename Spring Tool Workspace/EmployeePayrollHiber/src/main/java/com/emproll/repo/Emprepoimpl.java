package com.emproll.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emproll.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
 
@Repository
@Transactional
public class Emprepoimpl implements Emprepo{
	
	@Autowired
	EntityManager eManager;
	
	@Override
	public void save(Employee employee) {
		eManager.persist(employee);
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query = eManager.createQuery(hql);
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
		Employee emp = findById(id);
		eManager.remove(emp);
	}
}