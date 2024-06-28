package com.prabha.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.Employee;
import com.prabha.restapp.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl {
@Autowired
EmployeeRepo repo;
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public void updateEmployee(Employee emp) {
		repo.save(emp);
		
	}
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}

}
