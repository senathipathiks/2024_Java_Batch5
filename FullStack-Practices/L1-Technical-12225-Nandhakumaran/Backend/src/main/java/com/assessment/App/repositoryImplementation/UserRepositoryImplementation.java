package com.assessment.App.repositoryImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assessment.App.model.User;

import com.assessment.App.repository.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryImplementation implements UserRepository {

	@Autowired
	EntityManager eManager;
	
	public void saveU(User user) {
		// TODO Auto-generated method stub
		eManager.persist(user);
	}
	public List<User> findAllUsers() {
		String hql = "from User";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	@Override
	public User findUById(int id) {
		// TODO Auto-generated method stub
		return eManager.find(User.class, id);
	}
	@Override
	public void updateU(User user) {
		// TODO Auto-generated method stub
		eManager.merge(user);
	}
	@Override
	public void deleteU(int id) {
		User userToDelete = findUById(id);
	    if (userToDelete != null) {
	        eManager.remove(userToDelete);
	    }
}
	

}
