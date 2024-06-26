					package com.gopi.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gopi.sample.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("select sid from Student")
	List<Integer> fetchIdList();
	
	@Query("select sname from Student")
	List<String> fetchNameList();
	
	@Query("select sname from Student")
	List<String> fetchNameListDel();
	
	@Transactional
	void deleteStudentBySname(String sname);
	
	@Query("select s from Student s")
	List<Student> fetchAll();
	
	@Transactional
	Student findBySname(String sname);
}
