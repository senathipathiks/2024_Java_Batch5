package com.gana.SpringBootCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gana.SpringBootCrud.Repository.StudentRepo;
import com.gana.SpringBootCrud.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentRepo repo;
	

	public String addStudent(Student stud)
	{
		repo.save(stud);
		return"Success";
	}
	
	public String deleteStudent(int id)
	{
		repo.deleteById(id);
		return"Success";
	}

	@Override
	public List<Integer> getIdList() {
		List<Integer> idList = repo.fetchIdList();
		return idList;
	}
	
	public String deleteStudentByName(String name)
	{
		repo.deleteByName(name);
		return"Success";
	}

	@Override
	public List<String> getNameList() {
		List<String> nameList = repo.fetchNameList();
		return nameList;
	}
	
	public Student fetchOne(int id) {
		Student student = repo.findById(id).orElse(new Student());
		return student;
	}

	@Override
	public String updateStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}
	
	public Student findStudent(int id)
	{
				Student stud = repo.getById(id);
				return stud;
	}
	
	public Student findStudentByName(String name)
	{
				Student stud = repo.findByName(name);
				return stud;
	}

	public List<Student> viewAll() {
		List<Student> stud = repo.findAll();
		return stud;
	}

	@Override
	public List<Student> getStudList() {
		List<Student> studList = repo.StudList();
		return studList;
	}
	
	

	
	

	
	}

	


