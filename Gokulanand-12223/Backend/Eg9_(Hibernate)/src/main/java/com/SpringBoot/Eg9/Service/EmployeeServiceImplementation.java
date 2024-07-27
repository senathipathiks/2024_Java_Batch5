package com.SpringBoot.Eg9.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.SpringBoot.Eg9.Model.Employee;
import com.SpringBoot.Eg9.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	public EmployeeServiceImplementation(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	EmployeeRepo employeeRepo;
	
	@Override
	public String addEmployee(Employee employee) {
		employeeRepo.save(employee);
		System.out.println("employee service");
		return "AddSuccess";
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = employeeRepo.findAllEmployees();
		System.out.println(employee);
		return employee;
		
	}
	
	@Override
	public String updateEmployee(Employee employee) {
		employeeRepo.update(employee);
		return "UpdateSuccess";
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp = employeeRepo.findById(id);
		System.out.println(emp);
		return emp;
	}
	@Override
	public String deleteEmployee(int id) {
		employeeRepo.delete(id);
		return "DeleteSuccess";
	}
}