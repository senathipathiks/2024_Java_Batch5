package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.CollegeEvent;

@Repository
public interface CollegeEventRepo {
	public List<Integer> getIDList();

	void save(CollegeEvent event);

	List<CollegeEvent> findAll();

	void deleteById(int id);

	CollegeEvent findById(int id);
}
