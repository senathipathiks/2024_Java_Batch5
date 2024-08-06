package com.srienath.restapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.srienath.restapp.model.User;


public interface UserRepo extends JpaRepository<User, Integer>{
	
}
