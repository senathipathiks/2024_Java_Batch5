package com.gana.SpringBootCrud.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gana.SpringBootCrud.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	

	
	
	@Query("SELECT id FROM Student")
	List<Integer> fetchIdList();
	
	@Query("SELECT name FROM Student")
	List<String> fetchNameList();
	
	@Transactional
	void deleteByName(String name);
	
	@Transactional
	Student findByName(String name);

	@Query("select s FROM Student s")
	List<Student> StudList();

}
