package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.supraja.restapp.model.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer> {
	@Query("select pid from Payroll")
	public List<Integer> getIDList();

}

//public interface PayrollRepo
//{
//	public void save(Payroll payroll);
//
//	public Payroll findById(int id) ;
//
//	public List<Payroll> findAll();
//
//
//	public void update(Payroll payroll);
//
//	public void deleteById(int id);
//	List<Integer> fetchId();
//}
