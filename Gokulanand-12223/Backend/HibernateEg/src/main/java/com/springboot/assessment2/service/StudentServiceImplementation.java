package com.springboot.assessment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.assessment2.model.Student;
import com.springboot.assessment2.repo.StudentRepo;

@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepo repo;

	public StudentServiceImplementation(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addStudent(Student student) 
	{
		repo.save(student);
	}
	 
	@Override
	public List<Student> getallStudent() 
	{
	return repo.findAll();
	}
	 
	@Override
	public void updateStudent(Student student) 
	{
	repo.update(student);
	}
	 
	@Override
	public void deleteStudent(int sid) 
	{	
	repo.deleteById(sid);
	}

	@Override
	public Student findStuById(int sid) 
	{
		return repo.findById(sid);
	}
}
