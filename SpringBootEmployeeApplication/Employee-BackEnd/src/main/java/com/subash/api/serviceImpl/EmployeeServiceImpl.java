package com.subash.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subash.api.model.Employee;
import com.subash.api.ownrepo.EmployeeOwnRepo;

import com.subash.api.repository.EmployeeRepo;
import com.subash.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	EmployeeOwnRepo ownrepo;
	
	@Override
	public void addEmployee(Employee emp) {
		System.out.println(emp.getPayroll());
		System.out.println(emp);
		//repo.save(emp);//jparepository
		ownrepo.save(emp);//ownrepository
	}

	@Override
	public Employee getEmployee(int id) {
		
		//return repo.findById(id).get();
		return ownrepo.findById(id);
		
	}

	public List<Employee> getAllEmployees() {
		
		
		//return repo.findAll();
		return ownrepo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		//repo.save(emp);
		ownrepo.update(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		//repo.deleteById(id);
		ownrepo.deleteById(id);
		
	}

	@Override
	public void addEmployees(List<Employee> emp) {
		// TODO Auto-generated method stub
		
	}
	

}
