package com.aravind.micro.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravind.micro.model.Employee;
import com.aravind.micro.repository.EmployeeRepo;
import com.aravind.micro.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo emprepo;
	
	

	@Override
	public void addEmployee(Employee emp) {
		emprepo.save(emp);
		
	}

	@Override
	public Employee getEmployee(int eid) {
		return emprepo.findById(eid).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		emprepo.save(emp);
		
	}

	@Override
	public void deleteEmployee(int eid) {
		emprepo.deleteById(eid);
		
	}

}
