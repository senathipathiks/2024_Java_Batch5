package com.srienath.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.Pets;

@Repository
public interface PetsRepo extends JpaRepository<Pets,Integer>{
	@Query("select ppid from Pets")
	public List<Integer> getIDList();
}
