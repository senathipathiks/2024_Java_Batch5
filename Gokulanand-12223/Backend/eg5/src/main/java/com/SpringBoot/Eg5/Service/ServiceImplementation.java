package com.SpringBoot.Eg5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg5.Model.Student;
import com.SpringBoot.Eg5.Repo.Repo;

@Service
public class ServiceImplementation implements StudentService 
{
	@Autowired
	Repo repo;

	@Override
	public void addStudent(Student student) 
	{
		repo.save(student);
	}

	@Override
	public Student getStudent(int id) 
	{
		return repo.findById(id).get();
	}

	@Override
	public List<Student> getallStudent() {
		List<Student> stulist = repo.findAll();
		return stulist;
	}

	@Override
	public void updateStudent(Student student) 
	{
		repo.save(student);		
	}

	@Override
	public void deleteStudent(int id) 
	{	
		repo.deleteById(id);
	}
	
}
