package com.springboot.assessment2.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.assessment2.model.Admission;
import com.springboot.assessment2.repo.AdmissionRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AdmissionRepoImpl implements AdmissionRepo
{

	@Autowired
	EntityManager manager;
	
	@Override
	public void save(Admission admission) 
	{
		manager.persist(admission);
	}

	@Override
	public List<Admission> findAll() 
	{
		String str = "From Admission";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void deleteById(int aid) 
	{
		Admission adm = manager.find(Admission.class, aid);
		manager.remove(adm);
	}

	@Override
	public void update(Admission admission) 
	{
		manager.merge(admission);
	}

	@Override
	public Admission findAdmission(int aid) 
	{
		return manager.find(Admission.class, aid);
	}

}
