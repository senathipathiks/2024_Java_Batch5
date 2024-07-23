package com.emproll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emproll.model.Employee;
import com.emproll.repo.Emprepo;

 
@Service
public class Eserimpl implements Empservice{
	@Autowired
	Emprepo employeeRepo;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
		System.out.println("employee service");
		return "Success";
	}
	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.update(employee);
		return "Success";
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAllEmployees();
	}
	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}
	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.delete(id);
		return "Success";
	}
}