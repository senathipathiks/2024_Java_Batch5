package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gana.backend.model.Employee;
import com.gana.backend.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	EntityManager entityManager;
	
	@Override
    public void save(Employee employee) {
        entityManager.merge(employee);
    }
 
    @Override
    public Employee findById(int employeeid) {
        return entityManager.find(Employee.class, employeeid);
    }
 
    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }
 
    @Override
    public void update(Employee employee) {
        entityManager.merge(employee);
    }
 
    @Override
    public void deleteById(int employeeid) {
    	Employee employee = entityManager.find(Employee.class, employeeid);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }

}
