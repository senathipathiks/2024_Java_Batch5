package com.giri.sbapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.giri.sbapp.model.Student;

@Repository
public interface StudentRepo{
	@Query("select id from Student")
	public List<Integer> getIDList();

	public void save(Student stu);

	public Student findById(int id);

	public List<Student> findAll();

	public void update(Student stu);

	public void deleteById(int id);

}
