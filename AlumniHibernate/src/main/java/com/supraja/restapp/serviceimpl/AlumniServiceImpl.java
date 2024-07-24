package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Alumni;

import com.supraja.restapp.repository.AlumniRepo;

import com.supraja.restapp.service.AlumniService;

@Service

public class AlumniServiceImpl implements AlumniService {

	public AlumniServiceImpl(AlumniRepo repo) {
		super();
		this.repo = repo;
	}

	AlumniRepo repo;

	@Override
	public String addAlumni(Alumni alumni) {
		if(alumni !=null) {
			repo.save(alumni);
			return "success";
		}else {
			return "Fail to add";
		}
		
	}
	
	@Override
	public Alumni getAlumni(int aid) {
		Alumni alumni = repo.findById(aid);

		return alumni;

	}

	@Override
	public List<Alumni> getAllAlumni() {
		return repo.findAll();
	}

	@Override
	public String updateAlumni(Alumni alumni) {
        if(alumni!=null) {
        	repo.save(alumni);
    		return "updated";
        }
        else {
        	return "Not updated";
        }
	}

	
	
	@Override
	public String deleteAlumni(int aid) {
		Alumni alumni =repo.findById(aid);
		if(alumni!=null) {
			repo.deleteById(aid);
			return "Deleted";
		}else {
			return "Failed to delete";
		}
		
	}

	
	public List<Integer> getAllId() {
		return repo.getIDList();
	}
}
