package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Shop;
import com.madhan.restapp.repository.ShopRepo;

@Service
public class ShopServiceimpl {
	@Autowired
	ShopRepo repo;

	public void addShop(Shop shp) {
		// TODO Auto-generated method stub
		repo.save(shp);
	}

	public Shop getShop(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public List<Shop> getAllShop() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void updateShop(Shop shp) {
		// TODO Auto-generated method stub
		repo.save(shp);
	}

	public void deleteShop(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
