package com.sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sms.bean.Student;
import com.sms.util.StudentUtil;

public class StudentDao {
	public int studentInsert(Student student) {
		int n = 0;
		Session session = StudentUtil.openSession();
		Transaction tx = session.beginTransaction();
		n = (int) session.save(student);
		tx.commit();
		return n;
	}

	public List<Integer> idList() {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();

		Query query = session.createQuery("select id from Student");
		List<Integer> idList = query.list();
		session.close();
		return idList;
	}

	public void studentDelete(Student student) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(student);
		t.commit();
		session.close();
	}

	public void studentUpdate(Student student) {
		Session session = StudentUtil.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update Student set name = :name, batch = :batch where id = :id");
		query.setParameter("name", student.getName()).setParameter("batch", student.getBatch()).setParameter("id", student.getId());
		query.executeUpdate();
		System.out.println(student.getId());
//		session.update(student);
		tx.commit();
		session.close();
	}
	
	public Student studentFind(int id) {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.close();
		return student;
	}
	
	public List<Student> studentViewAll() {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("From Student");
		List<Student> stuList = query.list();
		session.close();
		return stuList;
	}
}
