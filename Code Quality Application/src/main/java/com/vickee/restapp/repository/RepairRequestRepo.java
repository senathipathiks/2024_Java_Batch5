package com.vickee.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.RepairRequest;

@Repository
public interface RepairRequestRepo extends JpaRepository<RepairRequest, Integer> {
	
	@Query("select oid from RepairRequest")
	List<Integer> fetAllOids();
}
