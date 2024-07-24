package com.nandha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nandha.restapp.model.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
