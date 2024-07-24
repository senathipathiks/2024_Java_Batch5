package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Room;

public interface RoomService {
	
	public void addRoom(Room room) ;

	public List<Room> getAllRoom();

	public void updateRoom(Room room);

	public void deleteRoom(int id);
	
	public Room getRoom(int id) ;

}
