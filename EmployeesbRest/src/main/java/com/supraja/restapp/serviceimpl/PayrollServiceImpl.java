package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.supraja.restapp.model.Payroll;

import com.supraja.restapp.repository.PayrollRepo;

import com.supraja.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {

	@Autowired
	PayrollRepo repo;

	@Override
	public void addPayroll(Payroll pay) {
		// TODO Auto-generated method stub

		repo.save(pay);
	}
	
	@Override
	public Payroll getPayroll(int id)
	{
//		Payroll payroll = repo.findById(id);
//		return payroll;
		//return repo.findById(pid).get();
		return repo.findById(id).get();
	}

	@Override
	public List<Payroll> getAllPayroll()
	{
		return repo.findAll();
	}
	
	@Override
	public void updatePayroll(Payroll pay)
	{
		//repo.save(payroll);
		repo.save(pay);
	}
	
	@Override
	public void deletePayroll(int id)
	{
		repo.deleteById(id);
	}
	
//	@Override
	public List<Integer> getAllId()
	{
		List<Integer> idList = repo.getIDList();
		return idList;
	}
}
