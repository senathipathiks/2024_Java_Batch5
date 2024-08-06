package com.srienath.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.srienath.restapp.model.MeetingRoom;
import com.srienath.restapp.repository.MeetingRoomRepo;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MeetingRoomRepoImpl implements MeetingRoomRepo {

	EntityManager entityManager;
	
	public MeetingRoomRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	public void save(MeetingRoom meetroom) {
		entityManager.persist(meetroom);

	}

	@Override
	public MeetingRoom findById(int id) {
		return entityManager.find(MeetingRoom.class, id);

	}

	@Override
	public List<MeetingRoom> findAll() {
		return entityManager.createQuery("from MeetingRoom", MeetingRoom.class).getResultList();

	}
	
	@Override
	public void update(MeetingRoom meetroom) {
		entityManager.merge(meetroom);
	}


	@Override
	public void deleteById(int id) {
		MeetingRoom meetroom = entityManager.find(MeetingRoom.class, id);
		if(meetroom !=null) {
			entityManager.remove(meetroom);
		}
	}
	
}
