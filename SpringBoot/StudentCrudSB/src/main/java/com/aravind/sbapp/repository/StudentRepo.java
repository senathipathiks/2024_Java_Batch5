package com.aravind.sbapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aravind.sbapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
//	@Query("select sid form Student")
//	List<Integer> fetchIdList();
	
	

}
