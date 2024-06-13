
package com.sms.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.sms.bean.Student;
import com.sms.util.StudentUtil;

//@Component
public class StudentDao {
	public int insertStudent(Student stud) {
		int n =0;
		Session session = StudentUtil.openSession();
		Transaction t = session.beginTransaction();
		n = (int)session.save(stud);
		t.commit();
		session.close();
		return n;
	}
	
//	public List<Integer> idList(){
//		Session session = StudentUtil.openSession();
//		Transaction t = session.beginTransaction();
//		
//		org.hibernate.Query query = session.createQuery("Select sid from Student");
//		List<Integer> idList = query.list();
//		t.commit();
//		session.close();
//		return idList;
//		
//	}
	
//	public List<Student> fetchAll(){
//	Session session = StudentUtil.openSession();
//	Transaction t = session.beginTransaction();
//	
//	org.hibernate.Query query = session.createQuery("Select sid from Student");
//	List<Student> studList = session.createQuery("From Student");
//	t.commit();
//	session.close();
//	return studList;
//	
//}
	

	
}
