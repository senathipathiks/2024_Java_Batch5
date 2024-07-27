package com.SpringBoot.Eg8.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg8.Model.Student;
import com.SpringBoot.Eg8.Repo.StudentRepo;

@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepo repo;

	@Override
	public void addStudent(Student student) 
	{
		repo.save(student);
	}

	@Override
	public Student getStudent(int stuid) 
	{
		return repo.findById(stuid).get();
	}

	@Override
	public List<Student> getallStudent() 
	{
		List<Student> studentlist = repo.findAll();
		return studentlist;
	}

	@Override
	public void updateStudent(Student student) 
	{
		repo.save(student);
	}

	@Override
	public void deleteStudent(int stuid) 
	{
		repo.deleteById(stuid);
	}

}
