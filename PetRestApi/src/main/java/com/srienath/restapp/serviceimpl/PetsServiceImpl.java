package com.srienath.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.model.Pets;
import com.srienath.restapp.repository.PetsRepo;
import com.srienath.restapp.service.PetsService;

@Service
public class PetsServiceImpl implements PetsService{

	@Autowired
	PetsRepo repo;
	
	public String addPet(Pets pets) {
			repo.save(pets);
			return "Success";
	}
	
	public Pets getPet(int id) {
		return repo.findById(id).get();
	}

	public List<Pets> getAllPets() {
		return repo.findAll();
	}

	public void updatePet(Pets pets) {
		repo.save(pets);
	}
	
	public void deletePet(int id) {
		repo.deleteById(id);
	}
	
	public List<Integer> getAllId()
	{
		List<Integer> idList = repo.getIDList();
		return idList;
	}
}


