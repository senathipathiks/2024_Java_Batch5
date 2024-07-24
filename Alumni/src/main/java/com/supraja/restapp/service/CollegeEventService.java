package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.CollegeEvent;

public interface CollegeEventService {
	public String addCollegeEvent(CollegeEvent event);

	public CollegeEvent getCollegeEvent(int eid);

	public List<CollegeEvent> getAllCollegeEvent();

	public String updateCollegeEvent(CollegeEvent event);

	public String deleteCollegeEvent(int eid);

}
