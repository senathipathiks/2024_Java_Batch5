package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.ShopKeeper;

public interface ShopKeeperService {
	
	public void addShopKeeper(ShopKeeper shop);
	public ShopKeeper getShopKeeper(int sid);
	public List<ShopKeeper> getAllShopKeeper();
	public void updateShopKeeper(ShopKeeper shop);
	public void deleteShopKeeper(int sid);
}
