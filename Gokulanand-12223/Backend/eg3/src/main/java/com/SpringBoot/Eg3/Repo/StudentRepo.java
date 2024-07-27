package com.SpringBoot.Eg3.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg3.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	@Query("select id from Student")
	List<Integer> fetchIdList();	
}
