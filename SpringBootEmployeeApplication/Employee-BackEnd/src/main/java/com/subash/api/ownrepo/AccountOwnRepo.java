package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.Account;
import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;


public interface AccountOwnRepo {
	public void save(Account account);

	public Account findById(int id) ;

	public List<Account> findAll();


	public void update(Account account);

	public void deleteById(int id);

}
