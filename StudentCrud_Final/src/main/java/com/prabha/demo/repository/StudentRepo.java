package com.prabha.demo.repository;

 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prabha.demo.model.Student;

import jakarta.transaction.Transactional;
 
 
@Repository

public interface StudentRepo extends JpaRepository<Student, Integer> {
	@Query("select sid from Student")
	List<Integer> fetchIdList();
	
	@Query("select sname from Student")
	List<String> fetchNameList();
	
	@Transactional
	void deleteStudentBySname(String sname);
	
	@Query("select s from Student s")
	List<Student> fetchAll();
}