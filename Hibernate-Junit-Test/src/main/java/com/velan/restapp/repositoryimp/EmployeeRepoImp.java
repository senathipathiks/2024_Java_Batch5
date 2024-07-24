package com.velan.restapp.repositoryimp;

import java.util.List;
import java.util.Optional;

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
	public String save(Employee employee) {
		if(employee!=null) {
		    em.merge(employee);
		    return "success";
		}
		else {
			return "failure";
		}
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}
	
	@Override
	public String update(Employee employee) {
		if(employee!=null) {
		    em.merge(employee);
		    return "success";
		}
		else {
			return "failure";
		}
	}
	@Override
	public String delete(int id) {
		Employee emp= em.find(Employee.class,id);
		if(emp!=null){
			em.remove(emp);
			return "success";
		}
		else {
			return "failure";
		}
	}
}

