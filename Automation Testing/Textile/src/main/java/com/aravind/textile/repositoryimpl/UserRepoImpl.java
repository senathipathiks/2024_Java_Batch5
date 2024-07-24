package com.aravind.textile.repositoryimpl;

import org.springframework.stereotype.Repository;

import com.aravind.textile.model.User;
import com.aravind.textile.repository.UserRepo;

import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;

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
	public String save(User user) {
		if(user != null) {
			em.merge(user);
			return "Success";
		}
		return "Failure";
		

	}

	@Override
	public User login(String username, String password) {
		String hql = "select u from User u WHERE username = :username and password = :password";
		Query query = em.createQuery(hql).setParameter("username", username).setParameter("password", password);
		return (User) query.getSingleResult();
	}

}
