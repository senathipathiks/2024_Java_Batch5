package com.EMS.App.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.EMS.App.model.Employee;

@Repository
public interface EmployeeRepository  {
	
//public void addEmployee(Employee employee);
//	
//	public Employee getEmployee(int id);
//	
//	public List<Employee> getAllEmployees();
//	
//	public void updateEmployee(Employee employee);
//	
//	public void deleteEmployee(int id);
	
public String save(Employee employee);
	
	public Employee findById(int id);
	
	public List<Employee> findAllEmployees();
	
	public void update(Employee employee);
	
	public void delete(int id);


}

