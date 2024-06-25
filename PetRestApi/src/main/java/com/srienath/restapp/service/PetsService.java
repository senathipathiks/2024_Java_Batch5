package com.srienath.restapp.service;

import java.util.List;

import com.srienath.restapp.model.Pets;

public interface PetsService {
	public String addPet(Pets pets);
	
	public Pets getPet(int id);
	
	public List<Pets> getAllPets();
	
	public void updatePet(Pets pets);
	
	public void deletePet(int id);
	
	List<Integer> getAllId();
}
