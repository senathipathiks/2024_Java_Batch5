package com.ems.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ems.bean.Employee;
import com.ems.util.EmployeeUtil;

public class EmployeeDao 
{
	 public int insertEmployee(Employee Empl)
	   {
		   int n=0;
		   
		   Session session=EmployeeUtil.openSession();
		   Transaction t=session.beginTransaction();
		   n=(int)session.save(Empl);
		   t.commit();
		   session.close();
		   return n;
	   }
	   
	   public List<Integer> idList(){
			Session session=EmployeeUtil.openSession();
		     Transaction t=session.beginTransaction();	
		     Query query=session.createQuery("select eid from Employee");
		     List<Integer> idList=query.list();
		     t.commit();
		     session.close();
		     return idList;
		}
	  
	   public void deleteEmployee(Employee Empl)
	   {
		   Session session=EmployeeUtil.openSession();
		   Transaction t=session.beginTransaction();
		   session.delete(Empl);
		   t.commit();
		   session.close();
	   }
	   
	   public Employee fetchOne(int id) {
			Session session=EmployeeUtil.openSession();
			Transaction t=session.beginTransaction();
			Employee emp=session.find(Employee.class,id);
			return emp;
		}
		public void updateEmployee(Employee Empl) {
			Session session=EmployeeUtil.openSession();
			Transaction t=session.beginTransaction();
			session.update(Empl);
			t.commit();
			session.close();
			
		}
		public List<Employee> fetchAll() {
			Session session=EmployeeUtil.openSession();
			Transaction t=session.beginTransaction();
			List<Employee> studList=session.createQuery("From Employee").list();
			session.close();
			return studList;
		}

	}

