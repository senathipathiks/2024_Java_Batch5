package com.keerthana.demo.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.Repo.StudRepo;
import jakarta.persistence.Query;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudRepoImpl implements StudRepo {

	
	@Autowired
	EntityManager eManager;
	
	
	
	@Override
	public void save(StudentBean stu) {
		eManager.persist(stu);
		
	}

	@Override
	public List<StudentBean> findAllStudents() {
		String hql = "from StudentBean";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public void update(StudentBean stu) {
		eManager.merge(stu);
		
		
	}

	@Override
	public StudentBean findById(int id) {
		// TODO Auto-generated method stub
		return eManager.find(StudentBean.class, id);
	}

	@Override
	public String deleteById(int id) {
		try {
			StudentBean stu = eManager.find(StudentBean.class, id);
			if(stu != null) {
				eManager.remove(stu);
				return "Student deleted successfully";
			} else {
				return "Student not found";
			}
		} catch (Exception e) {
			return "Failed to delete student";
		}
	}
	}


