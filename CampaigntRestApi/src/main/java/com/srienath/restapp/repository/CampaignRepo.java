package com.srienath.restapp.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.Campaign;

import jakarta.transaction.Transactional;

@Repository
public interface CampaignRepo extends JpaRepository<Campaign,Integer>{

	/*
	 * @Query("Select id from Student") List<Integer> fetchIdList();
	 * 
	 * @Query("Select name from Student") List<String> fetchNameList();
	 * 
	 * @Transactional void deleteByName(String name);
	 */


}
