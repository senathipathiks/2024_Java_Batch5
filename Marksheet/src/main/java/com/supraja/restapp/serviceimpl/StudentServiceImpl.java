package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Student;
import com.supraja.restapp.repository.StudentRepo;
import com.supraja.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		repo.save(student);
	}
	
	@Override
	public Student getStudent(int id)
	{
		return repo.findById(id).get();
	}

	@Override
	public List<Student> getAllStudent()
	{
		return repo.findAll();
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
