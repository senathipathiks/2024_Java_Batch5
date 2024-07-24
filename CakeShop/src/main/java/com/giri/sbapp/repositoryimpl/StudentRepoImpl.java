package com.giri.sbapp.repositoryimpl;

import java.util.List;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;


import com.giri.sbapp.model.Student;
import com.giri.sbapp.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo {
	
	@Autowired
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getIDList() {
		// TODO Auto-generated method stub
		String sql = "select stu.id from Student stu";
		Query query = em.createQuery(sql);
		return query.getResultList();
	}

	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub
		em.persist(stu);
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		String hql = "from Student";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public void update(Student stu) {
		em.merge(stu);
		
	}

	@Override
	public void deleteById(int id) {
		Student s = em.find(Student.class, id);
		em.remove(s);
		
	}

}