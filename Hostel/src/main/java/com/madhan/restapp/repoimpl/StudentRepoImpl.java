package com.madhan.restapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Student;
import com.madhan.restapp.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo {

	@Autowired
	EntityManager entitymanager;

	@Override
	public void save(Student stud) {
		entitymanager.persist(stud);
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return entitymanager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		String hql="from Student";
		Query query=entitymanager.createQuery(hql);
		return query.getResultList();	
		}

	@Override
	public void update(Student stud) {
		entitymanager.merge(stud);
		
	}

	@Override
	public void deleteById(int id) {
		Student stud=entitymanager.find(Student.class,id);
		entitymanager.remove(stud);
	
		
	}
	
	
}
