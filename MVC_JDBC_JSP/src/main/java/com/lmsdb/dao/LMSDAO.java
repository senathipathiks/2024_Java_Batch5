package com.lmsdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.ResultSetMetaData;

import com.lmsdb.bean.Employee;
import com.lmsdb.util.LmsdbUtil;
//import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class LMSDAO {

	public LinkedList<Employee> viewAll() throws SQLException {
		LinkedList<Employee> ls = new LinkedList<>();
		Connection con1 = LmsdbUtil.getConnection();
		int count = 0;
		String sql = "select * from employee_table";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getString(1));
			e.setEpmname(rs.getString(2));
			e.setEmpdesig(rs.getString(3));
			e.setEmpdept(rs.getString(4));
			ls.add(e);
		}
		return ls;
//		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " "
//				+ rms.getColumnName(4));
//		while (rs.next()) {
//
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//			count++;
//		}
//		con1.close();
		
	}

	public int doInsert(Employee e) throws SQLException {

		Connection con1 = LmsdbUtil.getConnection();
		int count = 0;
		String sql = "insert into employee_table values (?,?,?,?)";

		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, e.getEmpid());
		ps.setString(2, e.getEpmname());
		ps.setString(3, e.getEmpdesig());
		ps.setString(4, e.getEmpdept());
		int n = ps.executeUpdate();
		con1.close();
		return n;

	}

	public int doUpdate(Employee e) throws SQLException {

		Connection con1 = LmsdbUtil.getConnection();
		int count = 0;
		String sql = " update employee_table set empname=?,empdesig=?,empdept=? where empid=?";

		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, e.getEpmname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdept());
		ps.setString(4, e.getEmpid());
		int n = ps.executeUpdate();
		con1.close();
		return n;

	}
	public int doDelete(String id) throws SQLException {

		Connection con1 = LmsdbUtil.getConnection();
		int count = 0;
		String sql = " Delete from employee_table where empid=?";

		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, id);
		int n = ps.executeUpdate();
		con1.close();
		return n;

	}
	public LinkedList<Employee> doFind(String id) throws SQLException {
		LinkedList<Employee> ls = new LinkedList<>();
		Connection con1 = LmsdbUtil.getConnection();
		int count = 0;
		String sql = "Select * from employee_table where empid=?";

		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, id);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getString(1));
			e.setEpmname(rs.getString(2));
			e.setEmpdesig(rs.getString(3));
			e.setEmpdept(rs.getString(4));
			ls.add(e);
		}
		return ls;
//		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " "
//				+ rms.getColumnName(4));
//		while (rs.next()) {
//
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//			count++;
//		}
//		con1.close();
		

	}
}
