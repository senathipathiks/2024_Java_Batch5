package com.parlor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.parlor.bean.Parlor;
import com.parlor.util.ParlorUtil;



public class ParlorDAO {
	public int viewAll() throws SQLException {
		Connection con1 = ParlorUtil.getConnection();
		int count =0;
		String sql = "select * from user";
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
	
	public int doInsert(Parlor u) throws SQLException {
		Connection con1 = ParlorUtil.getConnection();
		String sql = "insert into user values(?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,u.getUserid());
		ps.setString(2,u.getUsername());
		ps.setInt(3,u.getUserage());
		ps.setString(4,u.getUserphoneno());
		ps.setString(5,u.getUseradd());
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	public int doUpdate(Parlor u) throws SQLException {
		Connection con1 = ParlorUtil.getConnection();
		String sql = "update user set username=?,userage=?,userphoneno=?,useradd=? where userid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setString(1,u.getUsername());
		ps.setInt(2,u.getUserage());
		ps.setString(3,u.getUserphoneno());
		ps.setString(4,u.getUseradd());
		ps.setInt(5,u.getUserid());
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	
	public int doDelete(int id) throws SQLException {
		Connection con1 = ParlorUtil.getConnection();
		String sql = "delete from user where userid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	public int doFindByID(int id) throws SQLException {
		Connection con1 = ParlorUtil.getConnection();
		int count =0;
		String sql = "select * from user where userid=?";
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
		Connection con1 = ParlorUtil.getConnection();
		int count =0;
		String sql = "select * from user where username=?";
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
