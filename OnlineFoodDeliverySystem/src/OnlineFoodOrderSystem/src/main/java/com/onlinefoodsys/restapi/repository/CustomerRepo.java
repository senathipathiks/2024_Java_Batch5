package com.onlinefoodsys.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlinefoodsys.restapi.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
  @Query("select cid from Customer")
  public List <Integer> getCids();
}
