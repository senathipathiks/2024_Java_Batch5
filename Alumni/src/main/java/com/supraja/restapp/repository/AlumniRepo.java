package com.supraja.restapp.repository;

import java.util.List;

import com.supraja.restapp.model.Alumni;

public interface AlumniRepo {

	public List<Integer> getIDList();

	void save(Alumni alumni);

	List<Alumni> findAll();

	void deleteById(int aid);

	Alumni findById(int aid);
}
