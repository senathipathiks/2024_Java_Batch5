package com.crs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crs.bean.Student;
import com.crs.util.CRSDBUtil;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class CRSDAO {
	
	public int viewAll() throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		int count = 0;
		String sql = "Select * from stud_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = (ResultSetMetaData) ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " " + rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			count++;
			
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Student s) throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		String sql = "insert into stud_tbl values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, s.getStudid());
		ps.setString(2, s.getStudname());
		ps.setString(3, s.getDepartment());
		ps.setInt(4, s.getStudscore());
		
		int n = ps.executeUpdate();
		con1.close();
		return n ;
		
		
		
	}
	
	public int doUpdate(Student s) throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		String sql = "update stud_tbl set studname = ?, department = ? , studscore = ? where studid = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, s.getStudname());
		ps.setString(2, s.getDepartment());
		ps.setInt(3, s.getStudscore());
		ps.setInt(4, s.getStudid());
		
		int n = ps.executeUpdate();
		con1.close();
		return n ;
		
		
		
	}
	
	public int doDelete(int id) throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		String sql = "delete from stud_tbl where studid = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n = ps.executeUpdate();
		con1.close();
		return n ;
		
		
		
	}
	
	public int doFind(int id) throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		int count = 0;
		String sql = "Select * from stud_tbl where studid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		ResultSetMetaData rms = (ResultSetMetaData) ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " " + rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			count++;
			
		}
		con1.close();
		return count;
		
		
		
	}
	public int doFindName(String name) throws SQLException
	{
		Connection con1 = CRSDBUtil.getConnection();
		
		int count = 0;
		String sql = "Select * from stud_tbl where studname=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,name);
		ResultSetMetaData rms = (ResultSetMetaData) ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2) + " " + rms.getColumnName(3) + " " + rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			count++;
			
		}
		con1.close();
		return count;
		
		
		
	}


}
