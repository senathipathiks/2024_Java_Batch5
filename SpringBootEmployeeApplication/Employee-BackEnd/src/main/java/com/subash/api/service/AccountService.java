package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Account;
import com.subash.api.model.Employee;

public interface AccountService {
	
	public void addAccount(Account emp);
	
	public Account getAccount(int id);
	
	public List<Account> getAllAccount();
	
	public void updateAccount(Account emp);
	
	public void deleteAccount(int id);
}
