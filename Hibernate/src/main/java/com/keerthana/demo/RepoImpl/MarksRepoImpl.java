package com.keerthana.demo.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.MarksBean;
import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.Repo.MarksRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MarksRepoImpl implements MarksRepo {

	@Autowired
	EntityManager eManager;
	
	@Override
	public void save(MarksBean mark) {
		eManager.persist(mark);
		
	}

	@Override
	public List<StudentBean> findAllMarks() {
		String hql = "from MarksBean";
		Query query = eManager.createQuery(hql);
		return query.getResultList();

	}

	@Override
	public void update(MarksBean mark) {
		eManager.merge(mark);
		
	}

	@Override
	public StudentBean findById(int id) {
		return eManager.find(StudentBean.class, id);
	}

}
