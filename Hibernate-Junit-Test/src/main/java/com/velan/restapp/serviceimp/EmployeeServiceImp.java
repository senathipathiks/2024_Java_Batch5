package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Employee;
import com.velan.restapp.repository.EmployeeRepo;
import com.velan.restapp.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public String addEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAllEmployees();
	}

	@Override
	public String updateEmployee(Employee employee) {
		return repo.update(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		return repo.delete(id);
	}

}
