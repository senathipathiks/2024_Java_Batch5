package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LMSDAO 
{
	public int doInsert(Employee e) throws SQLException
	   {
		   Connection con1=LMSDBUtil.getConnection();
		   //int count=0;
		   String sql="insert into Emp values(?,?,?,?)";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ps.setString(1, e.getEmpid());
		   ps.setString(2, e.getEmpname());
		   ps.setString(3, e.getEmpdesig());
		   ps.setString(4,e.getEmpdept());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	
	public int dodelete(String id1) throws SQLException
	   {
		   Connection con1=LMSDBUtil.getConnection();
		   String sql="delete from Emp where empid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setString(1,id1);
		 
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	
	 public int doUpdate(Employee e) throws SQLException
	   {
		   Connection con1=LMSDBUtil.getConnection();
		   String sql="update Emp set empname=?,empdesig=?,empdept=? where empid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setString(1, e.getEmpname());
		   ps.setString(2, e.getEmpdesig());
		   ps.setString(3, e.getEmpdept());
		   ps.setString(4, e.getEmpid());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	 
	 public Employee doFind(String id) throws SQLException {
		Connection con = LMSDBUtil.getConnection();
		System.out.println("Inside");
		String sql = "Select * from emp where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		Employee e1 = null;
		if (rs.next()) {
			e1 = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		System.out.println(e1);
		con.close();
		return e1;

	}
	 
	 public LinkedList doView() throws SQLException{
			Connection con = LMSDBUtil.getConnection();
			LinkedList<Employee> list = new LinkedList<>();
			String sql = "select * from emp";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Employee e2 = new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(e2);
			}
			
			
			
			return list;
			
	 }
}
