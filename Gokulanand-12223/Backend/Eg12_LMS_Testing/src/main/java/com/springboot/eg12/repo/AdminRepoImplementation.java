package com.springboot.eg12.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.eg12.model.Admin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AdminRepoImplementation implements AdminRepo
{
	EntityManager manager;

	public AdminRepoImplementation(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void save(Admin admin) 
	{
		manager.persist(admin);
	}

	@Override
	public List<Admin> findAllAdmins() 
	{
		String str = "From Admin";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void update(Admin admin) 
	{
		manager.merge(admin);
	}

	@Override
	public void deleteById(int adm_id) 
	{
		Admin adm = manager.find(Admin.class, adm_id);
		manager.remove(adm);
	}

	@Override
	public Admin findById(int adm_id) 
	{
		return manager.find(Admin.class, adm_id);
	}

	@Override
	public Admin findByName(String adm_name) 
	{
		String str = "From Admin where adm_name=:name";
		Query query = manager.createQuery(str);
		query.setParameter("name", adm_name);
		return (Admin) query.getSingleResult();
	}
}
