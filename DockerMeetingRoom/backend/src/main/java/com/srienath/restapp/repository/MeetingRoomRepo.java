package com.srienath.restapp.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.srienath.restapp.model.MeetingRoom;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface MeetingRoomRepo {
	public void save(MeetingRoom meetroom);
	
	public MeetingRoom findById(int id);
	
	public List<MeetingRoom> findAll();
	
	public void update(MeetingRoom meetroom);
	
	public void deleteById(int id);
	 
}
