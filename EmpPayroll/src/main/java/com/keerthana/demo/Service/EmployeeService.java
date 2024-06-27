package com.keerthana.demo.Service;

import java.util.List;

import com.keerthana.demo.Model.Employee;



public interface EmployeeService {

	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
	public String updateEmployee(Employee emp,int eid,int pId) ;
	public void deleteEmployee (int id);
	public String addEmpl(Employee empl, int pId);
	
}
