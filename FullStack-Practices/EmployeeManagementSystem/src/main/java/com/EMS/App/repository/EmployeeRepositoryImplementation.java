package com.EMS.App.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EMS.App.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepositoryImplementation implements EmployeeRepository{
	
//	@Autowired
//	EntityManager eManager;
//	
//	@Override
//	public void addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		eManager.persist(employee);
//	}
//	
//	@Override
//	public List<Employee> getAllEmployees() {
//		String hql = "from Employee";
//		Query query = eManager.createQuery(hql);
//		return query.getResultList();
//	}
//
//	@Override
//	public Employee getEmployee(int id) {
//	    return eManager.find(Employee.class, id);
//	}
//
//	@Override
//	public void updateEmployee(Employee employee) {
//	    Employee empToUpdate = getEmployee(employee.getId());
//	    if (empToUpdate != null) {
//	        eManager.merge(employee);
//	    }
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//	    Employee empToDelete = getEmployee(id);
//	    if (empToDelete != null) {
//	        eManager.remove(empToDelete);
//	    }
//	}
	
	@Autowired
	EntityManager eManager;
	
	@Override
	public String save(Employee employee) {
		eManager.persist(employee);
		return "success";
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return eManager.find(Employee.class, id);
	}
	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		eManager.merge(employee);
	}
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		eManager.remove(id);
//	}
	@Override
	public void delete(int id) {
	    Employee empToDelete = findById(id);
	    if (empToDelete != null) {
	        eManager.remove(empToDelete);
	    }
}

}

