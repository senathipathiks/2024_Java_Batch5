package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Loan;

public interface LoanService {

	public void addLoan(Loan loan);

	public Loan getLoan(int id);

	public List<Loan> getAllLoan();

	public void updateLoan(Loan loan);

	public void deleteLoan(int id);
}
