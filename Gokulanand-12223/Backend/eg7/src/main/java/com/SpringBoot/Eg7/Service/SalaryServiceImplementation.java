package com.SpringBoot.Eg7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg7.Model.Salary;
import com.SpringBoot.Eg7.Repo.SalaryRepo;

@Service
public class SalaryServiceImplementation implements SalaryService 
{
	@Autowired
	SalaryRepo repo;

	public void addSalary(Salary salary) 
	{
		repo.save(salary);
	}
	
	@Override
	public Salary getSalary(int salid) 
	{
		return repo.findById(salid).get();
	}

	@Override
	public List<Salary> getallSalary() 
	{
		List<Salary> sallist = repo.findAll();
		return sallist;
	}

	@Override
	public void updateSalary(Salary salary) 
	{
		repo.save(salary);
	}

	@Override
	public void deleteSalary(int salid) 
	{
		repo.deleteById(salid);
	}

}
