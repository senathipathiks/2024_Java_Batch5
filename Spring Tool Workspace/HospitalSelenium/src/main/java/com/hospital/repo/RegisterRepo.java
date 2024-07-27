package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer>{
	
	
	@Query(value = "select u from Register u where u.uname=:uname")
	public Register findByUsername(String uname);
}
