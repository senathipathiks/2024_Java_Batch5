package com.keerthana.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Payroll;
import com.keerthana.demo.Repoisatory.PayrollRepo;

@Service
public class PayrollServiceImpl {
	
	@Autowired
	PayrollRepo payrepo;

	public void addPay(Payroll pay) {
		
		payrepo.save(pay);
		
	}

	public Payroll getPayroll(int id) {
		return payrepo.findById(id).get();
	}

	public List<Payroll> getAllPayroll() {
		return payrepo.findAll();
	}

	public void updatePayroll(Payroll pay) {
		payrepo.save(pay);
		
	}

	public void deletePayroll(int id) {
		payrepo.deleteById(id);
		
	}

}
