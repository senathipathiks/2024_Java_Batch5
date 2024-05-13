package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

import com.lms.bean.Employee;
import com.lms.util.LMSdbutil;

public class LMSDAO {
	
	public int viewAll() throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Employee e) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		String sql = "insert into emp_tbl values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getEmployee_id());
		ps.setString(2,e.getEmpname());
		ps.setString(3, e.getEmpdesig());
		ps.setString(4, e.getEmpdept());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate(Employee e) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		String sql = "update emp_tbl set empname=?,empdesig=?, empdept=? where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		
		ps.setString(1,e.getEmpname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdept());
		ps.setInt(4, e.getEmployee_id());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete(int id) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		String sql = "Delete from emp_tbl where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doFind(int id) throws SQLException
	{
			
		Connection con1 = LMSdbutil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl where empid=?";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		
//		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		
		
//		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	} 
	
	public int doFindDept(String dept) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl where empdept=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,dept);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	} 
	public int doFindName(String Name) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl where empname=?";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,Name);
		
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	public int doFindDesg(String desg) throws SQLException
	{
		Connection con1 = LMSdbutil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl where empdesig=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,desg);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	} 
}
