package com.aravind.micro.repositoryimpl;



import org.springframework.stereotype.Repository;


import com.aravind.micro.model.User;
import com.aravind.micro.repository.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo {
	
	EntityManager em;

	public UserRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	@Override
	public void save(User user) {
		em.merge(user);
		
	}


	@Override
	public User login(String username, String password) {
		String hql = "select u from User u WHERE username = :username and password = :password";
		Query query = em.createQuery(hql).setParameter("username", username).setParameter("password", password);
		return (User) query.getSingleResult();
	}
	
	
	

}
