package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Employee;
import com.supraja.restapp.repository.EmployeeRepo;
import com.supraja.restapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void addEmployee(Employee empl) {
		// TODO Auto-generated method stub

		repo.save(empl);
		
	}
	
	@Override
	public Employee getEmployee(int id)
	{
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	@Override
	public void updateEmployee(Employee empl)
	{
		repo.save(empl);
	}
	
	@Override
	public void deleteEmployee(int id)
	{
		repo.deleteById(id);
	}
}
