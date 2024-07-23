package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Doctor;

@Repository
public interface Doctorrepo extends JpaRepository<Doctor, Integer>{
	public void deleteById(int id);
}