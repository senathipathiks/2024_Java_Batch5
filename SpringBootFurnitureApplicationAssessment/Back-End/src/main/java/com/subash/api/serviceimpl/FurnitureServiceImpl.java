package com.subash.api.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.subash.api.model.Furniture;
import com.subash.api.ownrepo.FurnitureOwnRepo;
import com.subash.api.service.FurnitureService;

@Service
public class FurnitureServiceImpl implements FurnitureService {
	
	
	public FurnitureServiceImpl(FurnitureOwnRepo ownrepo) {
		super();
		this.ownrepo = ownrepo;
	}

	FurnitureOwnRepo ownrepo;
	
	@Override
	public void addFurniture(Furniture furniture) {
		ownrepo.save(furniture);
	}

	@Override
	public Furniture getFurniture(int id) {

		return ownrepo.findById(id);
		
	}

	public List<Furniture> getAllFurniture() {
		return ownrepo.findAll();
	}

	@Override
	public void updateFurniture(Furniture furniture) {
	
		ownrepo.update(furniture);
		
	}

	@Override
	public void deleteFurniture(int id) {
		
		ownrepo.deleteById(id);
		
	}

	

}
