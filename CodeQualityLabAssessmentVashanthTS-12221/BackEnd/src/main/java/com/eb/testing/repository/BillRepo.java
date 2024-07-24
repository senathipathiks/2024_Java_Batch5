package com.eb.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.testing.model.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {

}
