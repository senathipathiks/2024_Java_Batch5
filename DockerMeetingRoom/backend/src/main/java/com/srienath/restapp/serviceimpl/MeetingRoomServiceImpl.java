package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.MeetingRoomService;
import java.util.List;
import org.springframework.stereotype.Service;
import com.srienath.restapp.repository.MeetingRoomRepo;
import com.srienath.restapp.model.MeetingRoom;

@Service
public class MeetingRoomServiceImpl implements MeetingRoomService{
	MeetingRoomRepo repo;
	
	public MeetingRoomServiceImpl(MeetingRoomRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addMeetRoom(MeetingRoom meetroom) {
		if(meetroom != null) {
			repo.save(meetroom);
			return "Success";
		}
		else {
			return "Fail to Add";
		}
	}
	
	@Override
	public MeetingRoom getMeetRoom(int id) {
		return repo.findById(id);
	}

	@Override
	public List<MeetingRoom> getAllMeetRooms() {
		return repo.findAll();
	}

	@Override
	public String updateMeetRoom(MeetingRoom meetroom) {
		if(meetroom != null) {
			repo.update(meetroom);
			return "Updated";
		}
		else {
			return "Not Updated";
		}
	}
	
	@Override
	public String deleteMeetRoom(int id) {
	    MeetingRoom meetingRoom = repo.findById(id).orElse(null);
	    if (meetingRoom != null) {
	        repo.deleteById(id);
	        return "Deleted";
	    } else {
	        return "Failed to delete";
	    }
	}
	
}
