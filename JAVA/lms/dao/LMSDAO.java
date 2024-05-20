package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LMSDAO {
	
	public int viewAll()throws SQLException
	{
		Connection con1=LMSDBUtil.getConnection();
		int count=0;
		String sql="Select * from emp_tbl";
		PreparedStatement ps= con1.prepareStatement(sql);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	public int doInsert(Employee e)throws SQLException
	{
		Connection con1=LMSDBUtil.getConnection();
		String sql="insert into emp_tbl values(?,?,?,?)";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, e.getEmpId());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getEmpdesig());
		ps.setString(4, e.getEmpdept());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Employee e)throws SQLException
	{
		Connection con1=LMSDBUtil.getConnection();
		String sql="update emp_tbl set empname=?,empdesig=?,empdept=? where empid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		
		ps.setString(1, e.getEmpname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdept());
		ps.setInt(4, e.getEmpId());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(int id)throws SQLException
	{
		Connection con1=LMSDBUtil.getConnection();
		String sql="delete from emp_tbl where empid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doFind(int id)throws SQLException
	{
		int count=0;
		Connection con1=LMSDBUtil.getConnection();
		String sql="select * from emp_tbl where empid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
//		ResultSetMetaData rms=ps.getMetaData();
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
	
		con1.close();
		return count;
	}
	public int doFindEmp(String name)throws SQLException
	{
		int count=0;
		Connection con1=LMSDBUtil.getConnection();
		String sql="select * from emp_tbl where empname=?";
		PreparedStatement ps= con1.prepareStatement(sql);
//		ResultSetMetaData rms=ps.getMetaData();
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
	
		con1.close();
		return count;
	}

}