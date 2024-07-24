package com.velan.restapp.serviceimp;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.velan.restapp.model.Transaction;
import com.velan.restapp.repository.TransactionRepo;
import com.velan.restapp.service.TransactionService;

@Service
public class TransactionServiceImp implements TransactionService {

	TransactionRepo repo;
	public TransactionServiceImp(TransactionRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addTransaction(Transaction trans) {		
		repo.save(trans);
	}

	@Override
	public Transaction getTransaction(int id) {		
		Optional<Transaction> transOptional=repo.findById(id);
		return transOptional.orElse(null);	
	}

	@Override
	public List<Transaction> getAllTransactions() {		
		return repo.findAll();
	}

	@Override
	public void updateTransaction(Transaction trans) {		
		repo.save(trans);		
	}

	@Override
	public void deleteTransaction(int id) {		
		repo.deleteById(id);		
	}
	
	@Override
	public List<Integer> getAllId()
	{	
		return repo.getIdList();
	}

}
