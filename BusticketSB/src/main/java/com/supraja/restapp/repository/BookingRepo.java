package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
	@Query("select bid from Booking")
	public List<Integer> getIDList();

}
