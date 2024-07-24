package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Employee;

public interface EmployeeService 
{
  public void addEmployee(Employee employee);
  
  public Employee getEmployee(int id);
  
  public List<Employee> getAllEmployee();
  
  public void updateEmployee(Employee employee);
  
  public void deleteEmployee(int id);
  
}
