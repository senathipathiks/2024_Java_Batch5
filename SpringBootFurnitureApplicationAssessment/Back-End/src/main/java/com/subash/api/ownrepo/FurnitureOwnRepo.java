package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.Furniture;


public interface FurnitureOwnRepo {
	public void save(Furniture furniture);

	public Furniture findById(int id) ;

	public List<Furniture> findAll();


	public void update(Furniture furniture);

	public void deleteById(int id);

}
