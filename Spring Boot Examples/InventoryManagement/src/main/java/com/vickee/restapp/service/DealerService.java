package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Dealer;

public interface DealerService {
	
	public void addDealer(Dealer dealer);
	public Dealer getDealer(int oid);
	public List<Dealer> getAllDealer();
	public void updateDealer(Dealer dealer);
	public void deleteDealer(int oid);
	public List<Integer> getAllOids();
}
