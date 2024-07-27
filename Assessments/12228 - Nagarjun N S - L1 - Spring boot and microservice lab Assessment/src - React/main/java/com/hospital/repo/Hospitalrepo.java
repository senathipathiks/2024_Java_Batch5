package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Hospital;

@Repository
public interface Hospitalrepo extends JpaRepository<Hospital, Integer>{
	public void deleteById(int id);
}
