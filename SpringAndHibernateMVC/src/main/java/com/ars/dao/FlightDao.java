package com.ars.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ars.bean.Flight;
import com.ars.util.FlightUtil;


public class FlightDao {
	public int insertFlight(Flight stud) {
		int n = 0;
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		n = (int) session.save(stud);
		t.commit();
		session.close();
		return n;
	}
	public List<Integer> idList() {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("select flightId from Flight");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
	}
	public Flight fetchOne(int id) {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		Flight stud = session.find(Flight.class, id);
		t.commit();
		session.close();
		return stud;
	}
	public void updateFlight(Flight f) {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(f);
		t.commit();
		session.close();
		
	}
	public void deleteFlight(Flight f) {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(f);
		t.commit();
		session.close();
	}
	public List<Flight> fetchAll() {
		Session session=FlightUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Flight> Flightlist = session.createQuery("From Flight").list();
		
		session.close();
		return Flightlist;
	}
	public List<String> nameList() {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("select flightName from Flight");
		List<String> nameList = query.list();
		t.commit();
		session.close();
		return nameList;
	}
	
	public Flight fetchOneName(String name) {
		Session session = FlightUtil.openSession();
		Transaction t = session.beginTransaction();
		//Flight f = session.get(Flight.class, name); here name is not a primary key we need to use the query to fetch the records
		Query<Flight> query = session.createQuery("FROM Flight WHERE flightName = :name", Flight.class);
	    query.setParameter("name", name);
	    Flight flight = query.uniqueResult();
		
		t.commit();
		session.close();
		return flight;
	}
	

}
