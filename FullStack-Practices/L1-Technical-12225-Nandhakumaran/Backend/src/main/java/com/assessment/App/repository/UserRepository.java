package com.assessment.App.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.App.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository{
	
	User findUById(int id);
    void saveU(User user);
    void deleteU(int id);
    void updateU(User user); 
	List<User> findAllUsers();
	
}

