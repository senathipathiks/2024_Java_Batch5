package com.SpringBoot.Eg3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg3.Repo.StudentRepo;
import com.SpringBoot.Eg3.model.Student;

@Service
public class ServiceImplementation implements StudentService
{
	@Autowired
	StudentRepo repo;
	
	public String addStudent(Student stud)
	{
		repo.save(stud);
		return "Success";		
	}

	public List<Integer> getIdList() 
	{
		List<Integer> idList = repo.fetchIdList();
		return idList;
	}

	@Override
	public void deleteStudent(int id) 
	{
		repo.deleteById(id);
	}

	public List<Student> viewAll() 
	{	
		return repo.findAll();
	}
	
	public Student findStudent(int id) 
	{
		return repo.findById(id).get();
	}
	
	public String updateStudent(Student student) 
	{
		repo.save(student);
		return "Success";
	}
}
