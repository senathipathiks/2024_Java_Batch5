package com.shp.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shp.bean.Meet;
import com.shp.util.MeetUtil;




public class MeetDao {

	public int meetInsert(Meet meet) {
		int n=0;
		Session session = MeetUtil.OpenSession();
		Transaction tx = session.beginTransaction();
		n = (int) session.save(meet);
		tx.commit();
		return n;
	}
	
	public List<Integer> idList(){
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		Query<Integer> query = session.createQuery("select bookingid from Meet");
		List<Integer> idList =  query.list();
		
		session.close();
		return idList;
	}
	
	public List<String> nameList(){
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		Query<String> query = session.createQuery("select meetUserName from Meet");
		List<String> nameList =  query.list();
		
		session.close();
		return nameList;
	}
	
	public void meetDelete(Meet meet) {
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		session.delete(meet);
		t.commit();
		session.close();
	}
	
	public void meetUpdate(Meet meet) {
		Session session = MeetUtil.OpenSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update Meet set meetUserid = :userid, meetRoomid = :roomid, meetUserName = :name, meetStartTime = :start, meetEndTime = :end where bookingid = :id");
		query.setParameter("userid", meet.getMeetUserid()).setParameter("roomid", meet.getMeetRoomid()).setParameter("name", meet.getMeetUserName()).setParameter("start", meet.getMeetStartTime()).setParameter("end", meet.getMeetEndTime()).setParameter("id", meet.getBookingid());
		query.executeUpdate();
		System.out.println(meet.getBookingid());
//		session.update(student);
		tx.commit();
		session.close();
	}
	
	public Meet meetFind(int id) {
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		Meet meet = session.get(Meet.class, id);
		session.close();
		return meet;
	}
	
	public Meet meetFindName(String name) {
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		 Query query = session.createQuery("select m from Meet m where m.meetUserName = :name");
	        query.setParameter("name", name);
		Meet meet = (Meet) query.getSingleResult();
		session.close();
		return meet;
	}
	
	public List<Meet> meetDisplay() {
		Session session = MeetUtil.OpenSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("From Meet");
		List<Meet> stuList = query.list();
		session.close();
		return stuList;
	}
	
}

