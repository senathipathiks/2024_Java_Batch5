package com.visitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import com.visitor.beans.Visitors;
import com.visitor.util.VisitorDBUtil;


public class VisitorDao {
	
	public int viewAll() throws SQLException {
		int count=0;
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "select * from visitor";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" || "+rms.getColumnName(2)+" || "+rms.getColumnName(3)+" || "+rms.getColumnName(4)+" || "+rms.getColumnName(5)+" || "+rms.getColumnName(6)+" || "+rms.getColumnName(7));
		System.out.println("-------------------------------------------------------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" || "+rs.getString(2)+" || "+rs.getString(3)+" || "+rs.getString(4)+" || "+rs.getString(5)+" || "+rs.getString(6)+" || "+rs.getString(7));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Visitors e) throws SQLException {
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "insert into visitor values(?,?,?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, e.getVid());
		ps.setString(2, e.getVname());
		ps.setString(3, e.getVph());
		ps.setString(4, e.getVpurpose());
		ps.setString(5, e.getVaddress());
		ps.setString(6, e.getEmp_name());
		ps.setString(7, e.getEmp_desig());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate(Visitors e) throws SQLException {
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "update visitor set vname=?,vph=?,visit_purpose=?,vaddress=?,empname=?,empdesig=? where vid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getVname());
		ps.setString(2, e.getVph());
		ps.setString(3, e.getVpurpose());
		ps.setString(4, e.getVaddress());
		ps.setString(5, e.getEmp_name());
		ps.setString(6, e.getEmp_desig());
		ps.setInt(7, e.getVid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete	(int id) throws SQLException {
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "delete from visitor where vid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doFind (int id) throws SQLException {
		int count=0;
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "select * from visitor where vid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindName (String name) throws SQLException {
		int count=0;
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "select * from visitor where vname=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindEmp (String emname) throws SQLException {
		int count=0;
		Connection con1 = VisitorDBUtil.getConnection();
		String sql = "select * from visitor where empname=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, emname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			count++;
		}
		con1.close();
		return count;
	}

}
