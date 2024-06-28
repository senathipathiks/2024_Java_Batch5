package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Dealer;
import com.vickee.restapp.repository.DealerRepo;
import com.vickee.restapp.service.DealerService;

@Service
public class DealerServiceImpl implements DealerService {
	
	@Autowired
	DealerRepo repo;

	@Override
	public void addDealer(Dealer dealer) {
		// TODO Auto-generated method stub
		repo.save(dealer);
	}

	@Override
	public Dealer getDealer(int oid) {
		// TODO Auto-generated method stub
		return repo.findById(oid).get();
	}

	@Override
	public List<Dealer> getAllDealer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateDealer(Dealer dealer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDealer(int oid) {
		// TODO Auto-generated method stub
		repo.deleteById(oid);
	}

	@Override
	public List<Integer> getAllOids() {
		// TODO Auto-generated method stub
		return repo.fetAllOids();
	}

}
