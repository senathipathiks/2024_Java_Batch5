package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.PetShopService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.repository.PetShopRepo;
import com.srienath.restapp.model.PetShop;

@Service
public class PetShopServiceImpl implements PetShopService{
	@Autowired
	PetShopRepo repo;
	
	@Override
	public String addPetShop(PetShop petshop) {
			repo.save(petshop);
			return "Success";
	}
	
	@Override
	public PetShop getPetShop(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<PetShop> getAllPetShops() {
		return repo.findAll();
	}

	@Override
	public void updatePetShop(PetShop petshop) {
		repo.save(petshop);
	}
	
	@Override
	public void deletePetShop(int id) {
		repo.deleteById(id);
	}
	
}
