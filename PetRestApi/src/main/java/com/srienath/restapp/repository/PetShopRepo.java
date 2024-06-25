package com.srienath.restapp.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.PetShop;

import jakarta.transaction.Transactional;

@Repository
public interface PetShopRepo extends JpaRepository<PetShop,Integer>{

	

}
