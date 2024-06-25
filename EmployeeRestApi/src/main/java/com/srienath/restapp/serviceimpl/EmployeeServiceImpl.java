package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.EmployeeService;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.repository.EmployeeRepo;
import com.srienath.restapp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public String addEmployee(Employee emp) {
			repo.save(emp);
			return "Success";
	}
	
	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
	
}
