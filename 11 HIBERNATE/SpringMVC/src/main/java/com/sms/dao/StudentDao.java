package com.sms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sms.bean.Student;
import com.sms.util.StudentUtil;

public class StudentDao {
	public int insertStudent(Student stud) {
		int n = 0;
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		n = (int) session.save(stud);
		t.commit();
		session.close();
		return n;
	}

	public List<Integer> idList() {

		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("select id from Student");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;

	}

	public void deleteStudent(Student stud) {

		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(stud);
		t.commit();
		session.close();

	}
	
	public Student fetchOne(int id) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		Student stud=session.find(Student.class, id);
		session.close();
		return stud;
		
	}
 
	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(stud);
		t.commit();
		session.close();
		
		
	}
	
	public List<Student> fetchAll() {
		// TODO Auto-generated method stub
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		List<Student> studlist = session.createQuery("From Student").list();
		session.close();
		
		return studlist;
	}

}
