package com.emppayroll.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emppayroll.restapi.model.EmpPay;


@Repository
public interface EmpPayRepo extends JpaRepository<EmpPay, Integer>{

}
