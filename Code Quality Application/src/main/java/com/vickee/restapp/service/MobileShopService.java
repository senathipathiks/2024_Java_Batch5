package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.MobileShop;

public interface MobileShopService {
	
	public void addMobileShop(MobileShop shop);
	public MobileShop getMobileShop(int mid);
	public List<MobileShop> getAllMobileShop();
	public void updateMobileShop(MobileShop shop);
	public void deleteMobileShop(int mid);
}
