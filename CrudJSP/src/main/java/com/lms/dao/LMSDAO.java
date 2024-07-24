package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LMSDAO {

	public LinkedList viewAll() throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		LinkedList<Employee> list=new LinkedList<Employee>();
		String sql="select * from emp";
		PreparedStatement ps=con1.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			list.add(e);
		}
		con1.close();
		return list;
	}
	
	public int doInsert(Employee e) throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		String sql="insert into emp value(?,?,?,?)";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setInt(1,e.getEmpid());
		ps.setString(2,e.getEmpname());
		ps.setString(3,e.getEmpdesig());
		ps.setString(4,e.getEmpdept());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Employee e) throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		String sql="update emp set empname=?,empdesig=?,empdept=? where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1,e.getEmpname());
		ps.setString(2,e.getEmpdesig());
		ps.setString(3,e.getEmpdept());
		ps.setInt(4,e.getEmpid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(int id) throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		String sql="delete from emp where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public Employee doFind(int empid) throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		String sql="select * from emp where empid=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setInt(1,empid);
		ResultSet rs=ps.executeQuery();
		Employee e=null;
		while(rs.next()) {
			e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		System.out.println(e);
		con1.close();
		return e;
		
		
	}
}
