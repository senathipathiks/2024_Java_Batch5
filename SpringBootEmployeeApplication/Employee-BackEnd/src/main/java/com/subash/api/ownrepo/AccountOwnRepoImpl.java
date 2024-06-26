package com.subash.api.ownrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subash.api.model.Account;
import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AccountOwnRepoImpl implements AccountOwnRepo {

	@Autowired
	EntityManager entityManager;
	
	@Override
    public void save(Account account) {
        entityManager.merge(account);
    }
 
    @Override
    public Account findById(int id) {
        return entityManager.find(Account.class, id);
    }
 
    @Override
    public List<Account> findAll() {
        return entityManager.createQuery("from Account", Account.class).getResultList();
    }
 
    @Override
    public void update(Account account) {
        entityManager.merge(account);
    }
 
    @Override
    public void deleteById(int id) {
    	Account account = entityManager.find(Account.class, id);
        if (account != null) {
            entityManager.remove(account);
        }
    }

}
