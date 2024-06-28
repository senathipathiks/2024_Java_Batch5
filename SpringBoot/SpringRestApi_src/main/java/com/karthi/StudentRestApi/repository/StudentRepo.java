package com.karthi.StudentRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthi.StudentRestApi.model.User;

@Repository
public interface StudentRepo extends JpaRepository<User, Integer>{

}
