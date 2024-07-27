package com.springboot.assessment2.repo;

import java.util.List;

import com.springboot.assessment2.model.Student;

public interface StudentRepo
{

	public void save(Student student);

	public List<Student> findAll();

	public void update(Student student);

	public void deleteById(int sid);
	
	public Student findById(int sid);
	
}
