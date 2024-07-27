package com.SpringBoot.Eg7.Service;

import java.util.List;

import com.SpringBoot.Eg7.Model.Salary;

public interface SalaryService 
{
	public void addSalary(Salary salary);
	
	public Salary getSalary(int salid);

	public List<Salary> getallSalary();
	
	public void updateSalary(Salary salary);
	
	public void deleteSalary(int salid);
}
