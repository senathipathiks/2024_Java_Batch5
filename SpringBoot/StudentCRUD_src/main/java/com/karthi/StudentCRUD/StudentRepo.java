package com.karthi.StudentCRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karthi.StudentCRUD.model.Student;

import jakarta.transaction.Transactional;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("select id from Student")
	public List<Integer> findAllId();

	@Query("select distinct name from Student")
	public List<String> findAllName();

	@Transactional
	public void deleteByName(String name);
	
}
