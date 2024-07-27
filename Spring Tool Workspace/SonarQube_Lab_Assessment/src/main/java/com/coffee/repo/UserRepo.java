package com.coffee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	public void deleteById(int id);
}
