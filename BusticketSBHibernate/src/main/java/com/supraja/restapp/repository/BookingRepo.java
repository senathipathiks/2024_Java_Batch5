package com.supraja.restapp.repository;

import java.util.List;



import com.supraja.restapp.model.Booking;


public interface BookingRepo  {
	
	public List<Integer> getIDList();
    
	void save(Booking booking);
	
	List<Booking> findAll();
	
	void deleteById(int bid);
	
	Booking findById(int bid);
}
