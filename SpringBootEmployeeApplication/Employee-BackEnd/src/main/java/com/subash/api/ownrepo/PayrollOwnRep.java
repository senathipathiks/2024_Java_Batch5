package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.Payroll;

public interface PayrollOwnRep {
	public void save(Payroll payroll);

	public Payroll findById(int id) ;

	public List<Payroll> findAll();


	public void update(Payroll payroll);

	public void deleteById(int id);
}
