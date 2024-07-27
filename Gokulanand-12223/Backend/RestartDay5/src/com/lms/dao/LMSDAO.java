package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lms.bean.Employee;
import com.lms.util.LMSDButil;

public class LMSDAO 
{
	public int viewAll() throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		int count=0;
		String sql = "Select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Employee e) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "insert into emp_tbl values (?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getEmpdesig());
		ps.setString(4, e.getEmpdept());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate(Employee e) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "update emp_tbl set emp_name=?, emp_desig=?, emp_dept=? where emp_id=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEmpname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdept());
		ps.setInt(4, e.getEmpid());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete(int id) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "delete from emp_tbl where emp_id=?" ;
		PreparedStatement ps = con1.prepareStatement(sql);
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doFind(int id2) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "select * from emp_tbl where emp_id=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id2);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
		}
		con1.close();
		return 0;
	}
	
	public int doFindByName(String name) throws SQLException
	{
		int count = 0;
		Connection con1 = LMSDButil.getConnection();
		String sql = "select * from emp_tbl where emp_name=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, name);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindByDesig(String desig) throws SQLException
	{
		int count = 0;
		Connection con1 = LMSDButil.getConnection();
		String sql = "select * from emp_tbl where emp_desig=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, desig);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindByDepart(String depart) throws SQLException
	{
		int count = 0;
		Connection con1 = LMSDButil.getConnection();
		String sql = "select * from emp_tbl where emp_dept=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, depart);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
}
