package com.velan.BootCRUD.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velan.BootCRUD.bean.Student;
import com.velan.BootCRUD.repository.StudentRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class StudentServiceTmp1 implements StudentService{
	
	@Autowired
	StudentRepo repo;
	
	@PersistenceContext
	private EntityManager em;
	
	public String addStudent(Student stud)
	{
		repo.save(stud);
		return "Success";
	}
	
	public List<Integer> idList(){
		return em.createQuery("select id from Student",Integer.class).getResultList();
	}

	public String deleteStudent(Student stud) {
		repo.delete(stud);
		return "Success";
	}

	public Optional<Student> fetchOne(int id) {
		return repo.findById(id);
	}

	public String UpdateStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}

	public List<Student> fetchAll() {
		return em.createQuery("from Student").getResultList();
	}
}
