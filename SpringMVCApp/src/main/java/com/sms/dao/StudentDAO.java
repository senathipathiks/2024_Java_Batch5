package com.sms.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.sms.bean.Student;
import com.sms.util.StudentUtil;

@Component
public class StudentDAO {
	public int insertStudent(Student stud)
	{
		int n = 0;
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		n=(int) session.save(stud);
		t.commit();
		session.close();
		return n;
	}

	public List<Integer> idList() {
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select sid from Student");
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
		Student stud = session.find(Student.class,id);
		t.commit();
		session.close();
		return stud;
	}
	
	public void updateStudent(Student stud) {
		Session session=StudentUtil.openSession();
		Transaction t=session.beginTransaction();
		session.update(stud);
		t.commit();
		session.close();
		
	}

	public List<Student> fetchAll() {
		Session session=StudentUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Student> studlist = session.createQuery("From Student").list();
		session.close();
		return studlist;
	}
	
public List<String> nameList(){
		
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select sname from Student");
		List<String> nameList = query.list();
		t.commit();
		session.close();
		return nameList;
	}

public Student fetchName(String name) {
	Session session = StudentUtil.openSession();
	Query query=session.createQuery("from Student where sname=?1");
	query.setParameter(1, name);
	Student stud = (Student) query.getSingleResult();
	return stud;
}

}
