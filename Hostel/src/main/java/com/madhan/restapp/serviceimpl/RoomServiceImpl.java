package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.repository.RoomRepo;

@Service
public class RoomServiceImpl {

	@Autowired
	RoomRepo repo;
	
	public void addRoom(Room room) {
		repo.save(room);
	}

	public Room getRoom(int id) {
		return repo.findById(id);	}

	public List<Room> getAllRoom() {
		return repo.findAll();
	}

	public void updateRoom(Room room) {
		repo.save(room);

	}

	public void deleteRoom(int id) {
		repo.deleteById(id);
		
	}

}
