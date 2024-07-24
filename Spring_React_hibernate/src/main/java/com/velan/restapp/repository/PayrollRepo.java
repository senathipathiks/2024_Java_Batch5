package com.velan.restapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Employee;
import com.velan.restapp.model.Payroll;

@Repository
public interface PayrollRepo{

	public void save(Payroll pay);
	public List<Payroll> findAllPayrolls();
	public Payroll findById(int id);
	public void update(Payroll pay);
	public void delete(int id);
	@Query("select pid from Payroll")
	public List<Integer> getIdList();
}
