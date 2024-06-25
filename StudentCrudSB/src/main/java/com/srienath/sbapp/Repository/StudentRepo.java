package com.srienath.sbapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.sbapp.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

	@Query("Select sid from Student")
	List<Integer> fetchIdList();

	@Query("Select sname from Student")
	List<String> fetchNameList();

	@Transactional
	void deleteBySname(String sname);


}
