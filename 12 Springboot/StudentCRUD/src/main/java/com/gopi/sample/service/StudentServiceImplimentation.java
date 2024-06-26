package com.gopi.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.gopi.sample.model.Student;
import com.gopi.sample.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentServiceImplimentation implements StudentService{
	
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
		List<String> nameList = repo.fetchNameList();
		return nameList;
//		return entityManager.createQuery("select sname from Student", String.class).getResultList();
	}
	
	public List<String> nameListDel(){
		List<String> nameList = repo.fetchNameListDel();
		return nameList;
	}
	
	
	
	public String deleteStudentByName(String sname) {
		repo.deleteStudentBySname(sname);
		return "Success";
	}
	
	public Student fetchOne(int id) {
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


	@Override
	public Student fetchById(int id) {
		Student stud1 = repo.getById(id);
		return stud1;
	}


	@Override
	public Student fetchBySname(String name) {
		Student stud = repo.findBySname(name);
		return stud;
	}
	
}
