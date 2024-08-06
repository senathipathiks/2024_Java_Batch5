package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.MeetingRoom;

public interface MeetingRoomService {
	public String addMeetRoom(MeetingRoom meetroom);
	
	public MeetingRoom getMeetRoom(int id);
	
	public List<MeetingRoom> getAllMeetRooms();
	
	public String updateMeetRoom(MeetingRoom meetroom);
	
	public String deleteMeetRoom(int id);

}
