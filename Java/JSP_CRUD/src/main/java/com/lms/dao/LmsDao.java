package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.lms.beans.Employee;
import com.lms.util.LmsDButil;

public class LmsDao {
	public LinkedList viewAll() throws SQLException {

		Connection con1 = LmsDButil.getConnection();
		String sql = "select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEid(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEdep(rs.getString(3));
			e.setEdes(rs.getString(4));
			
			list.add(e);
		}
		return list;
	}
	
	public int doInsert(Employee e) throws SQLException {
		Connection con1 = LmsDButil.getConnection();
		String sql = "insert into emp_tbl values(?,?,?,?)";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getEdes());
		ps.setString(4, e.getEdep());
		
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate	(Employee e) throws SQLException {
		Connection con1 = LmsDButil.getConnection();
		String sql = "Update emp_tbl set ename=?,epos=?,edep=? where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEname());
		ps.setString(2, e.getEdes());
		ps.setString(3, e.getEdep());
		ps.setInt(4, e.getEid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete	(int id) throws SQLException {
		Connection con1 = LmsDButil.getConnection();
		String sql = "delete from emp_tbl where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public LinkedList<Employee> doFind (int id) throws SQLException {
		Connection con1 = LmsDButil.getConnection();
		String sql = "select * from emp_tbl where eid="+id;
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		LinkedList<Employee> list = new LinkedList<>();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setEdep(rs.getString(3));
			emp.setEdep(rs.getString(4));
			
			list.add(emp);
		}		
		return list;
		
	}
}