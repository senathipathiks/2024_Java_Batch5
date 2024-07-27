package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.lms.bean.Employee;
import com.lms.util.LMSDButil;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class LMSDAO 
{	
	public int doInsert(Employee e) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "insert into emp_tbl values (?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEmpid());
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
		ps.setString(4, e.getEmpid());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete(String id) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "delete from emp_tbl where emp_id=?" ;
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,id);
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public  ResultSet  viewAll() throws SQLException 
	{
		Connection con1 = LMSDButil.getConnection();
		String sql  = "Select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
	
	public LinkedList<Employee> doFind(String id2) throws SQLException
	{
		Connection con1 = LMSDButil.getConnection();
		String sql = "select * from emp_tbl where emp_id="+id2;
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		LinkedList <Employee> list = new LinkedList<Employee>();
		while(res.next()) 
		{
			Employee e = new  Employee();
			
			e.setEmpid(res.getString(1));
			e.setEmpname(res.getString(2));
			e.setEmpdesig(res.getString(3));
			e.setEmpdept(res.getString(4));
			
			list.add(e);
		}
		return list;
	}
}

