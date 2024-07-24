package com.velan.restapp.service;

import java.util.List;

import com.velan.restapp.model.Transaction;

public interface TransactionService {

	public void addTransaction(Transaction trans);
	public Transaction getTransaction(int id);
	public List<Transaction> getAllTransactions();
	public void updateTransaction(Transaction trans);
	public void deleteTransaction(int id);
	public List<Integer> getAllId();

}
