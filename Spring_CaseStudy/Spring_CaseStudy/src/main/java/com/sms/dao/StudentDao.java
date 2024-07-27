package com.sms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.sms.bean.Student;
import com.sms.util.StudentUtil;


public class StudentDao {
	
	public int insertStudent(Student stud) {
		int n=0;
		
		Session s = StudentUtil.openSession();
		Transaction tx =s.beginTransaction();
		n = (int) s.save(stud);
		tx.commit();
		return n;
	}
	
	public void studentDelete(Student student) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(student);
		t.commit();
		session.close();
	}
	
	public List<Integer> idList(){
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select sid from Student");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
	}

	public Student fetchOne(int id) {
		
		Session s = StudentUtil.openSession();
		Transaction tx = s.beginTransaction();
		Student stud = s.find(Student.class, id);
		s.close();
		return stud;
	}

	public void updateStudent(Student stud) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(stud);
		t.commit();
		session.close();
	}
	
	public List<Student> fetchAll(){
		Session s = StudentUtil.openSession();
		Transaction tx = s.beginTransaction();
		List<Student> StudList = s.createQuery("From Student").list();
		s.close();
		return StudList;
	}
	
	public void findstu(Student stud) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.save(stud);
		t.commit();
		session.close();
	}
	
}
