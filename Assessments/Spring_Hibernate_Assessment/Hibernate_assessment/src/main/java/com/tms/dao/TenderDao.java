package com.tms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.bean.Tender;
import com.tms.util.TenderUtil;


public class TenderDao {
	
	public int insertTender(Tender tend) {
		int n=0;
		
		Session s = TenderUtil.openSession();
		Transaction tx =s.beginTransaction();
		n = (int) s.save(tend);
		tx.commit();
		return n;
	}
	
	public void tenderDelete(Tender tend) {
		Session session = TenderUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(tend);
		t.commit();
		session.close();
	}
	
	public List<Integer> idList(){
		Session session = TenderUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select tid from Tender");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
	}

	public Tender fetchOne(int id) {
		
		Session s = TenderUtil.openSession();
		Transaction tx = s.beginTransaction();
		Tender tend = s.find(Tender.class, id);
		s.close();
		return tend;
	}

	public Tender updateTender(Tender tend) {
		Session session = TenderUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(tend);
		session.close();
		return tend;
	}
	
	public List<Tender> fetchAll(){
		Session s = TenderUtil.openSession();
		Transaction tx = s.beginTransaction();
		List<Tender> TendList = s.createQuery("From Tender").list();
		s.close();
		return TendList;
	}
	
	public void findten(Tender tend) {
		Session session = TenderUtil.openSession();
		Transaction t = session.beginTransaction();
		session.save(tend);
		t.commit();
		session.close();
	}
	
}
