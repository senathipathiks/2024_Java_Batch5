package com.springboot.assessment2.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.assessment2.model.Student;
import com.springboot.assessment2.repo.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo
{

	@Autowired
	EntityManager manager;
	
	@Override
	public void save(Student student) 
	{
		manager.persist(student);
	}

	@Override
	public List<Student> findAll() 
	{
		String str = "From Student";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void update(Student student) 
	{
		manager.merge(student);
	}

	@Override
	public void deleteById(int sid) 
	{
		Student stu = manager.find(Student.class, sid);
		manager.remove(stu);
	}

	@Override
	public Student findById(int sid) 
	{
		return manager.find(Student.class, sid);
	}
	

}
