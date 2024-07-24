package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Booking;

public interface BookingService {
	public void addBooking(Booking booking);

	public Booking getBooking(int id);

	public List<Booking> getAllBooking();

	public void updateBooking(Booking booking);

	public void deleteBooking(int id);

}
