package com.prabha.demo.service;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.prabha.demo.model.Student;
import com.prabha.demo.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public String addStudent(Student stud)
	{
		repo.save(stud);
		return "Success";
	}
	
	
	@Override
	public List<Integer> idList()
	{
		List<Integer> idList = repo.fetchIdList();
		return idList;
//		return entityManager.createQuery("select sid from Student", Integer.class).getResultList(); one of the way
	}
	
	public String deleteStudent(int id) {
		repo.deleteById(id);;
		return "Success";
	}
	
	@Override
	public List<String> nameList()
	{
		List<String> NameList = repo.fetchNameList();
		return NameList;
//		return entityManager.createQuery("select sname from Student", String.class).getResultList();
	}
	
	public String deleteStudentByName(String sname) {
		repo.deleteStudentBySname(sname);
		return "Success";
	}
	
	public Student fetchOne(int id) {
		Student stud =repo.getById(id);
		return stud;
		
	}
	
	public Student fetchtwo(int id) {
		Student stud =repo.getById(id);
		return stud;
		
	}
 
	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		repo.save(stud);
		
		
	}
	
	public List<Student> fetchAll() {
		List<Student> studlist =repo.fetchAll();
		return studlist;
	}
}