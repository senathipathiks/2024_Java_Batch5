package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;

import com.emp.bean.Employee;
import com.emp.util.Emputil;


public class EMPDAO {
	List<Employee> Emp = new ArrayList<>();

	public int doInsert(Employee e) throws SQLException
	{
		Connection con1 = Emputil.getConnection();
		String sql = "insert into emp_tbl values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEmployee_id());
		ps.setString(2,e.getEmpname());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getPassword());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete(String id) throws SQLException
	{
		Connection con1 = Emputil.getConnection();
		String sql = "Delete from emp_tbl where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, id);		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate(Employee e) throws SQLException
	{
		Connection con1 = Emputil.getConnection();
		String sql = "update emp_tbl set empname=?,email=?, password=? where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,e.getEmpname());
		ps.setString(2, e.getEmail());
		ps.setString(3, e.getPassword());
		ps.setString(4, e.getEmployee_id());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
//	public ResultSet doFind(String id) throws SQLException
//	{
//		Connection con1 = Emputil.getConnection();
//		int count = 0;
//		String sql = "Select * from emp_tbl where empid=?";
//		PreparedStatement ps = con1.prepareStatement(sql);
//		ps.setString(1,id);
//		ResultSet rs = ps.executeQuery();
//		return rs;
//	} 
	
//	public  ResultSet  viewAll() throws SQLException {
//		Connection con1 = Emputil.getConnection();
//		String sql  = "Select * from emp_tbl";
//		PreparedStatement ps = con1.prepareStatement(sql);
//		ResultSet rs = ps.executeQuery();
//		return rs;
//	}
	
	public ArrayList<Employee> viewAll() throws SQLException 
	{
		Connection con1 = Emputil.getConnection();
		int count = 0;
		String sql = "Select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rsmd = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		ArrayList<Employee> al = new ArrayList<Employee>();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEmployee_id(rs.getString(1));
			emp.setEmpname(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setPassword(rs.getString(4));
			al.add(emp);
		}
		return al;
	}
	
	public ArrayList<Employee> doFind(String id) throws SQLException 
	{
		Connection con1 = Emputil.getConnection();
		int count = 0;		
		String sql = "Select * from emp_tbl where empid=?" ;
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,id);
		ResultSet rs = ps.executeQuery();
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		while(rs.next()) {
			
			Employee emp = new Employee();
			emp.setEmployee_id(rs.getString(1));
			emp.setEmpname(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setPassword(rs.getString(4));
			al.add(emp);
		}
		return al;
	}
	
//	public ResultSet doFind(String id) throws SQLException
//	{
//		Connection con1 = Emputil.getConnection();
//		int count = 0;
//		String sql = "Select * from emp_tbl where empid=?";
//		PreparedStatement ps = con1.prepareStatement(sql);
//		ps.setString(1,id);
//		ResultSet rs = ps.executeQuery();
//		
//		return rs;
//	} 
}
