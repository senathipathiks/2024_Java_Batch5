package com.gopi.restapi.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gopi.restapi.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo{

	@Autowired
	EntityManager entityM;
	
	@Override
	public void save(Student stud) {
		entityM.persist(stud);
	}
	
}
