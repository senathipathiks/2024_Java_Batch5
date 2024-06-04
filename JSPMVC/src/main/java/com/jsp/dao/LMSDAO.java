package com.jsp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.jsp.bean.Employee;
import com.jsp.util.LMSDBUtil;
import com.jsp.util.LMSDBUtil;


public class LMSDAO {
	int count=0;

	public ResultSet viewAll() throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="Select * from emp_tbl";
		PreparedStatement ps=con1.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		return rs;
	}
	public int doInsert(Employee e) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="insert into emp_tbl values (?,?,?,?)";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getDepartment());
		ps.setString(4, e.getEmpdesignation());
		int n =ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Employee e) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="update emp_tbl set empname=?,empdesignation=?,department=? where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, e.getEmpname());
		ps.setString(2, e.getEmpdesignation());
		ps.setString(3, e.getDepartment());
		ps.setString(4, e.getEmpid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(String id) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="delete from emp_tbl where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, id);
		
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public LinkedList<Employee> doFindByID(String id) throws SQLException
	{
Connection con1 = LMSDBUtil.getConnection();
		
		String sql = "select * from emp_tbl where empid = "+id;
		
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		while(rs.next()) {	
 
			Employee e = new Employee();
			e.setEmpid(rs.getString(1));
			e.setEmpname(rs.getString(2));
			e.setEmpdesignation(rs.getString(3));
			e.setDepartment(rs.getString(4));
			
			list.add(e);
		}
		
		return list;
	}

//	public int doFindName(String name) throws SQLException
//	{
//		Connection con1 = LMSDBUtil.getConnection();
//		
//		int count = 0;
//		String sql = "Select * from emp_tbl where empname=?";
//		PreparedStatement ps = con1.prepareStatement(sql);
//		ps.setString(1,name);
//		ResultSetMetaData rms = ps.getMetaData();
//		ResultSet rs = ps.executeQuery();
//		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " " + rms.getColumnName(4));
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//			count++;
//			
//		}
//		con1.close();
//		return count;
//		
//		
//		
//	}


}
