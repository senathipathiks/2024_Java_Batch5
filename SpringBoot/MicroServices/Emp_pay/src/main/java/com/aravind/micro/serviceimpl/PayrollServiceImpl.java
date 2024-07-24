package com.aravind.micro.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravind.micro.model.Payroll;
import com.aravind.micro.repository.PayrollRepo;
import com.aravind.micro.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {

	@Autowired
	PayrollRepo payrepo;
	
	@Override
	public void addPayroll(Payroll pay) {
		payrepo.save(pay);
		
	}

	@Override
	public Payroll getPayroll(int pid) {
		return payrepo.findById(pid).get();
	}

	@Override
	public List<Payroll> getAllPayroll() {
		return payrepo.findAll();
	}

	@Override
	public void updatePayroll(Payroll pay) {
		payrepo.save(pay);
		
	}

	@Override
	public void deletePayroll(int pid) {
		payrepo.deleteById(pid);
		
	}
	@Override
	public List<Integer> getAllId()
	{
		List<Integer> idList = payrepo.getIdList();
		return idList;
	}
	

}
