package com.boot.Ex.repository;


import com.boot.Ex.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


