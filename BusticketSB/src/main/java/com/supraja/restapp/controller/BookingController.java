package com.supraja.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supraja.restapp.model.Booking;
import com.supraja.restapp.serviceimpl.BookingServiceImpl;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {
	
	public BookingController(BookingServiceImpl service) {
		super();
		this.service = service;
	}

	BookingServiceImpl service;

	@PostMapping
	public String insertBooking(@RequestBody Booking book) {
		String msg = "";
		try {
			service.addBooking(book);
			msg = "Successfull";
		} catch (Exception e) {
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public Booking getBookingbyId(@PathVariable("id") int id) {
		return service.getBooking(id);
	}

	@GetMapping("/all")
	public List<Booking> getBooking() {
		return service.getAllBooking();
	}

	@PutMapping
	public String updateBooking(@RequestBody Booking book) {
		String msg = "";
		try {
			service.updateBooking(book);
			msg = " Update Success";
		} catch (Exception e) {
			msg = "Failure update";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteBooking(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteBooking(id);
			msg = "Deletion Success";
		} catch (Exception e) {
			msg = " Deletion Failure";
		}

		return msg;
	}

	@GetMapping("/idlist")
	public List<Integer> getIDList() {
		return service.getAllId();
	}
}
