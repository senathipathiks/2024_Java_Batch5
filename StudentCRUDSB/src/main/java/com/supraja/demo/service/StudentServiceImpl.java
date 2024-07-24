package com.supraja.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supraja.demo.Bean.Student;
import com.supraja.demo.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;

	@PersistenceContext
	private EntityManager entityManager;

	public String addStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}

//  public List<Integer> idList()
//  {
//	  return entityManager.createQuery("Select sid from Student",Integer.class).getResultList();
//  }
//  
//  public String deleteStudent(Student stud)
//  {
//	  repo.delete(stud);
//	  return "Success";
//  }

	public List<Integer> idList() {
		List<Integer> idList = repo.fetchIdList();
		return idList;

	}

	public List<String> getNameList() {
		List<String> nameList = repo.fetchNameList();
		return nameList;

	}

	public void deleteStudent(int sid) {
		repo.deleteById(sid);
	}

	public void deleteName(String sname) {
		repo.deleteBySname(sname);
	}
	
	public Student fetchOne(int id) {
		Student stud =repo.getById(id);
		return stud;
		
	}
 
	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		repo.save(stud);
		
		
	}
}
