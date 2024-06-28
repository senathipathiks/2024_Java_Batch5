package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.ShopKeeper;
import com.vickee.restapp.repository.ShopKeeperRepo;
import com.vickee.restapp.service.ShopKeeperService;

@Service
public class ShopKeeperServiceImpl implements ShopKeeperService {
	
	@Autowired
	ShopKeeperRepo repo;
	@Override
	public void addShopKeeper(ShopKeeper shop) {
		// TODO Auto-generated method stub
		repo.save(shop);
		
	}

	@Override
	public ShopKeeper getShopKeeper(int sid) {
		// TODO Auto-generated method stub
		return repo.findById(sid).get();
	}

	@Override
	public List<ShopKeeper> getAllShopKeeper() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateShopKeeper(ShopKeeper shop) {
		// TODO Auto-generated method stub
		repo.save(shop);
	}

	@Override
	public void deleteShopKeeper(int sid) {
		// TODO Auto-generated method stub
		repo.deleteById(sid);
		
	}

}
