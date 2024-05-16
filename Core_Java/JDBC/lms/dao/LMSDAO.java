package com.lms.dao; //controller

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LMSDAO {
	
	
	public int viewAll() throws SQLException {
		int count =0;
		Connection con = LMSDBUtil.getConnection();
		String sql = "Select * from emp_tbl";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData(); //for getting the column count
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
			
		}
		con.close();
		return count;
		
	}
	public int doInsert(Employee e) throws SQLException {
		Connection con = LMSDBUtil.getConnection();
		String sql = "Insert into emp_tbl values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getEmpdesig());
		ps.setString(4, e.getEmpdet());
		
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public int doUpdate(Employee e) throws SQLException {
		Connection con = LMSDBUtil.getConnection();
		String sql = "Update emp_tbl set empname=?,empdesig=?,empdet=? where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, e.getEmpname());
		ps.setString(2, e.getEmpdesig());
		ps.setString(3, e.getEmpdet());
		ps.setInt(4, e.getEmpid());
		
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public int doDelete(int id) throws SQLException {
		Connection con = LMSDBUtil.getConnection();
		String sql = "Delete from emp_tbl where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public int doFind(int id) throws SQLException {
		int count =0;
		Connection con = LMSDBUtil.getConnection();
		String sql = "Select * from emp_tbl where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSetMetaData rms = ps.getMetaData(); //for getting the column count
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
			
		}
		con.close();
		return count;
		
	}
	public int doFind1(String name) throws SQLException {
		int count =0;
		Connection con = LMSDBUtil.getConnection();
		String sql = "Select * from emp_tbl where empname=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSetMetaData rms = ps.getMetaData(); //for getting the column count
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
			
		}
		con.close();
		return count;
		
	}
	public int doFind2(String des) throws SQLException {
		int count =0;
		Connection con = LMSDBUtil.getConnection();
		String sql = "Select * from emp_tbl where empdesig=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, des);
		ResultSetMetaData rms = ps.getMetaData(); //for getting the column count
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
			
		}
		con.close();
		return count;
		
	}
	public int doFind3(String dep) throws SQLException {
		int count =0;
		Connection con = LMSDBUtil.getConnection();
		String sql = "Select * from emp_tbl where empdet=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dep);
		ResultSetMetaData rms = ps.getMetaData(); //for getting the column count
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
			
		}
		con.close();
		return count;
		
	}



}
