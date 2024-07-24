package com.madhan.restapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.repository.RoomRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RoomRepoImpl implements RoomRepo{

	@Autowired
	EntityManager entitymanager;

	@Override
	public void save(Room room) {
		
		entitymanager.persist(room);
	
	}

	@Override
	public List<Room> findAll() {
		String hql="from Room";
		Query query=entitymanager.createQuery(hql);
		return query.getResultList();	
		}

	@Override
	public void deleteById(int id) {
		Room room=entitymanager.find(Room.class,id);
		entitymanager.remove(room);
	
	}

	@Override
	public Room findById(int id) {
		return entitymanager.find(Room.class, id);
	}

}
