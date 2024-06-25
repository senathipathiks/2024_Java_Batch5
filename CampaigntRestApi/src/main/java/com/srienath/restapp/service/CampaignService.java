package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.Campaign;

public interface CampaignService {
	public String addCampaign(Campaign camp);
	
	public Campaign getCampaign(int id);
	
	public List<Campaign> getAllCampaigns();
	
	public void updateCampaign(Campaign stud);
	
	public void deleteCampaign(int id);

}
