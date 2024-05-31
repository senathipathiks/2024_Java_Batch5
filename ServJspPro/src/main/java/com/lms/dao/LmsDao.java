package com.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lms.bean.Employee;
import com.lms.util.Lmsdbutil;


public class LmsDao {
  
	public  ResultSet  viewAll() throws SQLException {
		
		Connection con1 = Lmsdbutil.getConnection();
//		int cnt=0;
		String sql  = "Select * from emp";
		PreparedStatement ps = con1.prepareStatement(sql);
//		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		
		
		return rs;
	}

	public int doinsert(Employee e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "Insert into emp values(?,?,?,?)";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setInt(3, e.getsal());
		ps.setString(4, e.getEmpdesg());
		cnt = ps.executeUpdate();
		return cnt;
	}
	
	public int doupdate(Employee e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "update  emp set ename=?,sal=?,desg=? where eid=?";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		
		ps.setString(1, e.getEmpname());
		ps.setInt(2, e.getsal());
		ps.setString(3, e.getEmpdesg());
		ps.setInt(4, e.getEmpid());
		cnt = ps.executeUpdate();
		return cnt;
	}

	public int dodelete(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		String sql  = "delete from emp where eid = "+id;
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		cnt = ps.executeUpdate();
		return cnt;
	}

	public ArrayList<Employee> dofind(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		
		String sql  = "Select * from emp where eid = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
//		ResultSetMetaData rms = ps.getMetaData();
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		ArrayList <Employee> find = new ArrayList<Employee>();
		while(rs.next()) {
			Employee e=new  Employee();
			e.setEmpid(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setsal(rs.getInt(3));
			e.setEmpdesg(rs.getString(4));
			find.add(e);
		}
		
		return find;
//		return rs;
	}
	
	public ArrayList<Employee> dofindbyName(String empname) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = Lmsdbutil.getConnection();
		int cnt=0;
		String sql  = "Select * from emp where desg = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
//		ResultSetMetaData rms = ps.getMetaData();
		ps.setString(1, empname);
		ResultSet rs = ps.executeQuery();
//		System.out.println(rms.getColumnName(1)+"\t"+rms.getColumnName(2)+"\t \t"+rms.getColumnName(3)+"\t"+rms.getColumnName(4));
//		System.out.println();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
//			cnt++;
//		}
		ArrayList <Employee> filter = new ArrayList<Employee>();
		while(rs.next()) {
			Employee e=new  Employee();
			e.setEmpid(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setsal(rs.getInt(3));
			e.setEmpdesg(rs.getString(4));
			filter.add(e);
		}
		
		return filter;
	}
	  
}
