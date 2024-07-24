package com.madhan.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer> {

}
