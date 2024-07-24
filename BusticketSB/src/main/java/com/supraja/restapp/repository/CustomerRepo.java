package com.supraja.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
