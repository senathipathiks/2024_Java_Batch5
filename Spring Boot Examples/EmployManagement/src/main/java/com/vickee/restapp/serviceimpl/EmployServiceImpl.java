package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Employee;
import com.vickee.restapp.repository.EmployRepo;
import com.vickee.restapp.service.EmpService;

@Service
public class EmployServiceImpl implements EmpService {
	
	@Autowired
	EmployRepo repo;
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);	}

}
