package com.ams.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.ams.bean.Alumni;
import com.ams.util.AlumniUtil;

//@Component
public class AlumniDAO 
{
   public int insertAlumni(Alumni alum)
   {
	   int n=0;
	   
	   Session session=AlumniUtil.openSession();
	   Transaction t=session.beginTransaction();
	   n=(int)session.save(alum);
	   t.commit();
	   session.close();
	   return n;
   }
   
   public List<Integer> idList(){
		Session session=AlumniUtil.openSession();
	     Transaction t=session.beginTransaction();	
	     Query query=session.createQuery("select aid from Alumni");
	     List<Integer> idList=query.list();
	     t.commit();
	     session.close();
	     return idList;
	}
  
   public void deleteAlumni(Alumni alum)
   {
	   Session session=AlumniUtil.openSession();
	   Transaction t=session.beginTransaction();
	   session.delete(alum);
	   t.commit();
	   session.close();
   }
   
   public Alumni fetchOne(int id) {
		Session session=AlumniUtil.openSession();
		Transaction t=session.beginTransaction();
		Alumni alum=session.find(Alumni.class,id);
		return alum;
	}
	public void updateAlumni(Alumni alum) {
		Session session=AlumniUtil.openSession();
		Transaction t=session.beginTransaction();
		session.update(alum);
		t.commit();
		session.close();
		
	}
	public List<Alumni> fetchAll() {
		Session session=AlumniUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Alumni> alumList=session.createQuery("From Alumni").list();
		session.close();
		return alumList;
	}

}
