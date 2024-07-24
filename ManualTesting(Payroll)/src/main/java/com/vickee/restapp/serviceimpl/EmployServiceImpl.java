package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	public String addEmployee(Employee employee) {
		if(employee!=null) {
		repo.save(employee);
		return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public Employee getEmployee(int eid) {
		Optional<Employee> empOptional = repo.findById(eid);
		return empOptional.orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public String updateEmployee(Employee employee) {
		if(employee!=null) {
			repo.save(employee);
			return "success";
			}
			else {
				return "failure";
			}
		
	}

	@Override
	public String deleteEmployee(int eid) {
		Optional<Employee> emp = repo.findById(eid);
		if(emp.isPresent()) {
			repo.deleteById(eid);
			return "success";
		}
		else {
			return "failure";
		}
		}

}
