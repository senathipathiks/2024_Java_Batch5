package com.madhan.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Room;

@Repository


public interface RoomRepo {

	void save(Room room);

	List<Room> findAll();

	void deleteById(int id);

	Room findById(int id);
}
