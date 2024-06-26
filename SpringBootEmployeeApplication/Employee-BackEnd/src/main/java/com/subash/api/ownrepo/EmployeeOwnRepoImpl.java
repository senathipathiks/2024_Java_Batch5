package com.subash.api.ownrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeOwnRepoImpl implements EmployeeOwnRepo {

	@Autowired
	EntityManager entityManager;
	
	@Override
    public void save(Employee employee) {
        entityManager.merge(employee);
    }
 
    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
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
    public void deleteById(int id) {
    	Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }

}
