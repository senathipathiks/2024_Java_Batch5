package com.coffee.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.model.User;
import com.coffee.repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo{
	
	@Autowired
	EntityManager emanager;

	@Override
	public void deleteById(int id) {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "from User";
		Query q = emanager.createQuery(hql);
		return q.getResultList();
	}

	@Override
	public User findUserById(int id) {
		return emanager.find(User.class, id);
	}

	@Override
	public void updateUser(User user) {
		emanager.merge(user);
	}

	@Override
	public void save(User user) {
		emanager.persist(user);
	}

}
