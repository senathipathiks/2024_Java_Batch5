package com.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lms.bean.Applicant;
import com.lms.util.Lmsdbutil;


public class LmsDao {
  
	public  ResultSet  viewAll() throws SQLException {
		
		Connection con1 = Lmsdbutil.getConnection();

		String sql  = "Select * from applicant";
		PreparedStatement ps = con1.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		
		
		return rs;
	}

	public int doinsert(Applicant e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "Insert into applicant values(?,?,?,?)";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setString(1, e.getAid());
		ps.setString(2, e.getAname());
		ps.setString(3, e.getJob());
		ps.setString(4, e.getSts());
		cnt = ps.executeUpdate();
		return cnt;
	}
	
	public int doupdate(Applicant e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "update  applicant set aname=?,job=?,sts=? where aid=?";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		
		
		ps.setString(1, e.getAname());
		ps.setString(2, e.getJob());
		ps.setString(3, e.getSts());
		ps.setString(4, e.getAid());
		cnt = ps.executeUpdate();
		return cnt;
	}

	public int dodelete(String id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "delete from applicant where aid = "+id;
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		cnt = ps.executeUpdate();
		return cnt;
	}

	public ArrayList<Applicant> dofind(String id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		
		String sql  = "Select * from applicant where aid = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
//		ResultSetMetaData rms = ps.getMetaData();
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		ArrayList <Applicant> find = new ArrayList<Applicant>();
		while(rs.next()) {
			Applicant e=new  Applicant();
			e.setAid(rs.getString(1));
			e.setAname(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSts(rs.getString(4));
			find.add(e);
		}
		
		return find;

	}
	
	public ArrayList<Applicant> dofindbyName(String empname) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		int cnt=0;
		String sql  = "Select * from applicant where job = ?";
		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, empname);
		ResultSet rs = ps.executeQuery();
		ArrayList <Applicant> filter = new ArrayList<Applicant>();
		while(rs.next()) {
			Applicant e=new  Applicant();
			e.setAid(rs.getString(1));
			e.setAname(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSts(rs.getString(4));
			filter.add(e);
		}
		
		return filter;
	}
	  
}
