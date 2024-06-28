package com.gana.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gana.backend.model.Employee;
import com.gana.backend.model.PayRoll;
import com.gana.backend.repository.PayRollRepo;
import com.gana.backend.repository.EmployeeRepo;
import com.gana.backend.service.PayRollService;

@Service
public class PayRollServiceImpl implements PayRollService {
	
	@Autowired
	PayRollRepo repo;

	@Override
	public void addPayRoll(PayRoll payroll) {
		
		repo.save(payroll);
		

	}
	
	@Override
	public PayRoll getPayRoll(int payrollid) {
		
		return repo.findById(payrollid);
		

	}

	@Override
	public List<PayRoll> getAllPayRolls() {
		return repo.findAll();
		
	}

	@Override
	public void updatePayRoll(PayRoll payroll) {
		repo.update(payroll);
		
	}
	
	
	@Override
	public void deletePayRoll(int payrollid) {
		repo.deleteById(payrollid);
	}
	

}
