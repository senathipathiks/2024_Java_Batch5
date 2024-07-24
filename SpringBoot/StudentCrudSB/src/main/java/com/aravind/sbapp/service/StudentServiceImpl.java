package com.aravind.sbapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravind.sbapp.model.Student;
import com.aravind.sbapp.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentServiceImpl implements  StudentService{
	
	@Autowired
	StudentRepo repo;
	
	 @PersistenceContext
	 private EntityManager entityManager;
	
	public String addStudent(Student stud) {
		repo.save(stud);
		return "Success";
		
	}

	public List<Integer> idList() {
		
		        return entityManager.createQuery("SELECT sid FROM Student", Integer.class).getResultList();
		
	}
	
//	public List<Integer> idList(){
//		List<Integer> idList= repo.fetchIdList();
//		return idList;
//}

	public String deleteStudent(Student stud) {
		repo.delete(stud);
		return "Success";
		
		
	}
	

	public Optional<Student> fetchOne(int id) {

		return repo.findById(id);
	}

	public String updateStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}

	public List<Student> fetchAll() {
		return entityManager.createQuery("from Student").getResultList();
	}

}
