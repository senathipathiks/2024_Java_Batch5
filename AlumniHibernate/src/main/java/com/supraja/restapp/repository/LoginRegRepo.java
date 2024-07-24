package com.supraja.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.LoginReg;

@Repository
public interface LoginRegRepo extends JpaRepository<LoginReg, Integer> {

	LoginReg findByUsername(String username);
}
