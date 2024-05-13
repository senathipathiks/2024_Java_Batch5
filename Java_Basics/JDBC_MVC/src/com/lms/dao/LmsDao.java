package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LmsDao {
	
	public int viewAll() throws SQLException {
		int count=0;
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "select * from emp_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
//		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doInsert(Employee e) throws SQLException {
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "insert into emp_tbl values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getEpos());
		ps.setString(4, e.getEdep());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doUpdate	(Employee e) throws SQLException {
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "Update emp_tbl set ename=?,epos=?,edep=? where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEname());
		ps.setString(2, e.getEpos());
		ps.setString(3, e.getEdep());
		ps.setInt(4, e.getEid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete	(int id) throws SQLException {
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "delete from emp_tbl where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doFind (int id) throws SQLException {
		int count=0;
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "select * from emp_tbl where eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindName (String name) throws SQLException {
		int count=0;
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "select * from emp_tbl where ename=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindDep (String dep) throws SQLException {
		int count=0;
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "select * from emp_tbl where edep=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, dep);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int doFindPos (String pos) throws SQLException {
		int count=0;
		Connection con1 = LMSDBUtil.getConnection();
		String sql = "select * from emp_tbl where epos=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, pos);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	
	
}