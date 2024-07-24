package com.supraja.restapp.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Booking;
import com.supraja.restapp.repository.BookingRepo;

import com.supraja.restapp.service.BookingService;

@Service

public class BookingServiceImpl implements BookingService {

	public BookingServiceImpl(BookingRepo repo) {
		super();
		this.repo = repo;
	}

	BookingRepo repo;

	@Override
	public String addBooking(Booking book) {
		repo.save(book);
		return "AddSuccess";
	}

	
	@Override
	public Booking getBooking(int id) {
		Booking booking = repo.findById(id);
		
			return booking;

	}

	@Override
	public List<Booking> getAllBooking() {
		return repo.findAll();
	}

	@Override
	public void updateBooking(Booking book) {

		repo.save(book);
	}

	@Override
	public void deleteBooking(int id) {
		repo.deleteById(id);
	}

	public List<Integer> getAllId() {
		return repo.getIDList();
	}
}
