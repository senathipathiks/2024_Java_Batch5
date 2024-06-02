package com.evn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.evn.bean.Event;
import com.evn.util.EVNDBUtil;



public class EVNDAO {
	
	public int doInsert(Event e) throws SQLException {	
		Connection con1 = EVNDBUtil.getConnection();
		String sql = "insert into Event values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getEtime());
		ps.setInt(4, e.getEamount());
		int n = ps.executeUpdate();
		con1.close();
		return n;
}
	public int doUpdate(Event e) throws SQLException {
		Connection con1 = EVNDBUtil.getConnection();
		String sql = "update cust_tbl set Ename=?,Edesig=? where Eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEname());
		ps.setString(2, e.getEtime());
		ps.setInt(3, e.getEamount());
		ps.setInt(4, e.getEid());
		int n = ps.executeUpdate();
//		con1.close();
		return n;
		}
	
	public int doDelete(int id) throws SQLException {
		Connection con1 = EVNDBUtil.getConnection();
//		System.out.println("Inside funciton");
		String sql = "delete from Event where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n = ps.executeUpdate();
		con1.close();
		return n;
		}
	
	public Event doFind(int id) throws SQLException {
		Connection con1=EVNDBUtil.getConnection();
				String sql="select * from Event where eid=?";
				PreparedStatement ps= con1.prepareStatement(sql);
				ResultSetMetaData rms=ps.getMetaData();
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				Event e=null;
				while(rs.next())
				{
					 e = new Event(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(1));
					
				}
				con1.close();
				return e;
	}
	public LinkedList doFindAll() throws SQLException{
		Connection con1=EVNDBUtil.getConnection();
		LinkedList<Event> list = new LinkedList<Event>();
		String sql="select * from cust_tbl";
		PreparedStatement ps= con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Event e = new Event(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			list.add(e);
		}
		con1.close();
		return list;
	}
}
