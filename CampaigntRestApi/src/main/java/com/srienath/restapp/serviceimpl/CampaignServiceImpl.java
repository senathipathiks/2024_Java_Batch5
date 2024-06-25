package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.CampaignService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.repository.CampaignRepo;
import com.srienath.restapp.model.Campaign;

@Service
public class CampaignServiceImpl implements CampaignService{
	@Autowired
	CampaignRepo repo;
	
	@Override
	public String addCampaign(Campaign camp) {
			repo.save(camp);
			return "Success";
	}
	
	@Override
	public Campaign getCampaign(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Campaign> getAllCampaigns() {
		return repo.findAll();
	}

	@Override
	public void updateCampaign(Campaign camp) {
		repo.save(camp);
	}
	
	@Override
	public void deleteCampaign(int id) {
		repo.deleteById(id);
	}
	
}
