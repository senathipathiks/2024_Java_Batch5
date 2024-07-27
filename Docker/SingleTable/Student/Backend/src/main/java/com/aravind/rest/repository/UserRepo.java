package com.aravind.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aravind.rest.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	@Transactional
	User findByUsername(String username);
}
