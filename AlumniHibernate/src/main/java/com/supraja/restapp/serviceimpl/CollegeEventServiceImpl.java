package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Alumni;
import com.supraja.restapp.model.CollegeEvent;
import com.supraja.restapp.repository.CollegeEventRepo;
import com.supraja.restapp.service.CollegeEventService;

@Service
public class CollegeEventServiceImpl implements CollegeEventService {

	public CollegeEventServiceImpl(CollegeEventRepo repo) {
		super();
		this.repo = repo;
	}

	CollegeEventRepo repo;

	@Override
	public String addCollegeEvent(CollegeEvent event) {
		if(event !=null) {
			repo.save(event);
			return "success";
		}else {
			return "Fail to add";
		}

	}

	
	@Override
	public CollegeEvent getCollegeEvent(int eid) {
		CollegeEvent event = repo.findById(eid);

		return event;
	}

	@Override
	public List<CollegeEvent> getAllCollegeEvent() {
		return repo.findAll();
	}

	@Override
	public String updateCollegeEvent(CollegeEvent event) {
		if(event!=null) {
        	repo.save(event);
    		return "updated";
        }
        else {
        	return "Not updated";
        }
	}

	@Override
	public String deleteCollegeEvent(int eid) {
		CollegeEvent event =repo.findById(eid);
		if(event!=null) {
			repo.deleteById(eid);
			return "Deleted";
		}else {
			return "Failed to delete";
		}
		
	}
}
