package com.subash.api.ownrepoimpl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.subash.api.model.Furniture;

import com.subash.api.ownrepo.FurnitureOwnRepo;

import jakarta.persistence.EntityManager;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FurnitureOwnRepoImpl implements FurnitureOwnRepo {

	
	public FurnitureOwnRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	EntityManager entityManager;
	
	@Override
    public void save(Furniture furniture) {
        entityManager.merge(furniture);
    }
 
    @Override
    public Furniture findById(int id) {
        return entityManager.find(Furniture.class, id);
    }
 
    @Override
    public List<Furniture> findAll() {
        return entityManager.createQuery("from Furniture", Furniture.class).getResultList();
    }
 
    @Override
    public void update(Furniture furniture) {
        entityManager.merge(furniture);
    }
 
    @Override
    public void deleteById(int id) {
    	Furniture furniture = entityManager.find(Furniture.class, id);
        if (furniture != null) {
            entityManager.remove(furniture);
        }
    }

}
