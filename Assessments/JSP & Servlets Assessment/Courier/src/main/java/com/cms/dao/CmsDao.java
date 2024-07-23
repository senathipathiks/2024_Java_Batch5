package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.cms.bean.User;
import com.cms.util.CmsDButil;

public class CmsDao {
	public LinkedList viewAll() throws SQLException {

		Connection con1 = CmsDButil.getConnection();
		String sql = "select * from user";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		LinkedList<User> list = new LinkedList<User>();
		while(rs.next()) {
			User e = new User();
			e.setUid(rs.getInt(1));
			e.setUname(rs.getString(2));
			e.setCid(rs.getInt(3));
			e.setUadd(rs.getString(4));
			e.setDesti(rs.getString(5));
			e.setRec_name(rs.getString(6));
			
			list.add(e);
		}
		return list;
	}
	
	public int doInsert(User e) throws SQLException {
		Connection con1 = CmsDButil.getConnection();
		String sql = "insert into user values(?,?,?,?,?,?)";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getUid());
		ps.setString(2, e.getUname());
		ps.setInt(3, e.getCid());
		ps.setString(4, e.getUadd());
		ps.setString(5, e.getDesti());
		ps.setString(6, e.getRec_name());
		
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate	(User e) throws SQLException {
		Connection con1 = CmsDButil.getConnection();
		String sql = "Update user set uname=?,courier_id=?,user_address=?,destination_address=?,receiver_name=? where uid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getUname());
		ps.setInt(2, e.getCid());
		ps.setString(3, e.getUadd());
		ps.setString(4, e.getDesti());
		ps.setString(5, e.getRec_name());
		ps.setInt(6, e.getUid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete	(int id) throws SQLException {
		Connection con1 = CmsDButil.getConnection();
		String sql = "delete from user where uid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public LinkedList<User> doFind (int id) throws SQLException {
		Connection con1 = CmsDButil.getConnection();
		String sql = "select * from user where uid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		LinkedList<User> list = new LinkedList<User>();
		while(rs.next()) {
			User u = new User();
			u.setUid(rs.getInt(1));
			u.setUname(rs.getString(2));
			u.setCid(rs.getInt(3));
			u.setUadd(rs.getString(4));
			u.setDesti(rs.getString(5));
			u.setRec_name(rs.getString(6));
			
			list.add(u);
		}
		return list;
		
	}
}
