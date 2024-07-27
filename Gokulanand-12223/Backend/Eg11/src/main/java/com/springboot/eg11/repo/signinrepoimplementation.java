package com.springboot.eg11.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.eg11.model.signin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class signinrepoimplementation implements signinrepo
{
	
	public signinrepoimplementation(EntityManager emanager) {
		super();
		this.emanager = emanager;
	}
	EntityManager emanager;

	@Override
	public void save(signin signin) 
	{
		emanager.persist(signin);
	}

	@Override
	public List<signin> getAllUsers() 
	{
		String hql = "from signin";
		Query query =emanager.createQuery(hql);
		return query.getResultList();
	}

}
