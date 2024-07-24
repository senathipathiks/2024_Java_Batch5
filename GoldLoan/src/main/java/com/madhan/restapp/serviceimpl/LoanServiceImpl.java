package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Loan;
import com.madhan.restapp.repository.LoanRepo;

@Service
public class LoanServiceImpl {
	@Autowired
	LoanRepo repo;

	public void addLoan(Loan loan) {
		repo.save(loan);
	}

	public Loan getLoan(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Loan> getAllLoan() {
		return repo.findAll();
	}

	public void updateLoan(Loan loan) {
		repo.save(loan);
	}

	public void deleteLoan(int id) {
		repo.deleteById(id);
	}

}
