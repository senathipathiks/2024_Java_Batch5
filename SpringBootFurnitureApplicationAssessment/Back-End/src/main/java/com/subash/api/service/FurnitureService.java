package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Furniture;

public interface FurnitureService {
	
	public void addFurniture(Furniture emp);
	
	public Furniture getFurniture(int id);
	
	public List<Furniture> getAllFurniture();
	
	public void updateFurniture(Furniture emp);
	
	public void deleteFurniture(int id);
}
