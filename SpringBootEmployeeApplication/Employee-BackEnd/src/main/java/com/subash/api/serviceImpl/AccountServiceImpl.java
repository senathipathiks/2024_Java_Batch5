package com.subash.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subash.api.model.Account;
import com.subash.api.model.Employee;
import com.subash.api.ownrepo.AccountOwnRepo;
import com.subash.api.ownrepo.EmployeeOwnRepo;

import com.subash.api.repository.EmployeeRepo;
import com.subash.api.service.AccountService;
import com.subash.api.service.EmployeeService;

@Service
public class AccountServiceImpl implements AccountService {

//	@Autowired
//	EmployeeRepo repo;
	
	@Autowired
	AccountOwnRepo ownrepo;
	
	@Override
	public void addAccount(Account account) {
		//repo.save(emp);//jparepository
		ownrepo.save(account);//ownrepository
	}

	@Override
	public Account getAccount(int id) {
		
		//return repo.findById(id).get();
		return ownrepo.findById(id);
		
	}

	public List<Account> getAllAccount() {
		
		
		//return repo.findAll();
		return ownrepo.findAll();
	}

	@Override
	public void updateAccount(Account account) {
		
		//repo.save(emp);
		ownrepo.update(account);
		
	}

	@Override
	public void deleteAccount(int id) {
		
		//repo.deleteById(id);
		ownrepo.deleteById(id);
		
	}
	

}
