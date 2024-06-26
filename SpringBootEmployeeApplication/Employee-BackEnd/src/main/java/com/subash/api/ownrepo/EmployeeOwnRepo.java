package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;


public interface EmployeeOwnRepo {
	public void save(Employee Employee);

	public Employee findById(int id) ;

	public List<Employee> findAll();


	public void update(Employee Employee);

	public void deleteById(int id);

}
