package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


import com.student.bean.Student;
import com.student.util.StudentUtil;



public class StudentDAO {
	
	public int viewAll() throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		int count =0;
		String sql = "select * from student";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Student e) throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		String sql = "insert into student values(?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,e.getStdid());
		ps.setString(2,e.getStdname());
		ps.setInt(3,e.getStdage());
		ps.setString(4,e.getDob());
		ps.setString(5,e.getStddep());
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	public int doUpdate(Student e) throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		String sql = "update student set stdname=?,stdage=?,age=?,stddep=? where stdid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setString(1,e.getStdname());
		ps.setInt(2,e.getStdage());
		ps.setString(3,e.getDob());
		ps.setString(4,e.getStddep());
		ps.setInt(5,e.getStdid());
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	
	public int doDelete(int id) throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		String sql = "delete from student where stdid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	public int doFindByID(int id) throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		int count =0;
		String sql = "select * from student where stdid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindByName(String name) throws SQLException {
		Connection con1 = StudentUtil.getConnection();
		int count =0;
		String sql = "select * from student where stdname=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,name);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
}
