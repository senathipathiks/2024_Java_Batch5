package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Shop;

public interface ShopService {

	public void addShop(Shop shp);

	public Shop getShop(int id);

	public List<Shop> getAllShop();

	public void updateShop(Shop shp);

	public void deleteShop(int id);
}
