package com.vickee.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Dealer;

@Repository
public interface DealerRepo extends JpaRepository<Dealer, Integer>{
	
	@Query("select oid from Dealer")
	List<Integer> fetAllOids();
}
