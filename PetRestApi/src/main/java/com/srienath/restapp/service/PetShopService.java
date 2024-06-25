package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.PetShop;

public interface PetShopService {
	public String addPetShop(PetShop petshop);
	
	public PetShop getPetShop(int id);
	
	public List<PetShop> getAllPetShops();
	
	public void updatePetShop(PetShop petshop);
	
	public void deletePetShop(int id);
	
}
