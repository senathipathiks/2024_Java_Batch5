package com.nandha.Myapplication.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nandha.Myapplication.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select studid from Student")
	public List<Integer> findAllId();
	
	@Query("select  studName from Student")
	public List<String> findAllName();
	
	@Transactional
	void deleteByStudName (String studName);

	@Transactional
	Student findByStudName(String studName);
}
