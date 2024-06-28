package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Employee;
import com.madhan.restapp.repository.EmployeeRepo;

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


	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}


	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
