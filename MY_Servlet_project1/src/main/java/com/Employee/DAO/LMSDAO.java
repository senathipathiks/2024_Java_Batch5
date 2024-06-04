package com.Employee.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

import com.Employee.bean.Employee;
import com.Employee.util.LMSDBUtil;

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
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getEmpdept());
		ps.setString(4, e.getEmpdesig());
		int n =ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Employee e) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="update emp_tbl set empname=?,empdesig=?,empdept=? where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, e.getEmpname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdept());
		ps.setInt(4, e.getEmpid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(int id) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="delete from emp_tbl where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setInt(1, id);
		
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public ResultSet doFindByID(int id) throws SQLException
	{
		Connection con1 = LMSDBUtil.getConnection();
		String sql="Select * from emp_tbl where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		return rs;
	}
	
}
