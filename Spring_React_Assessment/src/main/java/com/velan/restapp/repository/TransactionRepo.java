package com.velan.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

	@Query("select tid from Transaction")
	public List<Integer> getIdList();
}
