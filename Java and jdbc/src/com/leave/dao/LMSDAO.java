package com.leave.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.leave.bean.Employee;
import com.leave.util.LMSDBUtil;

public class LMSDAO {

	public int viewAll() throws  Exception{

		Connection conn = LMSDBUtil.getConnection();
		int cnt = 0;
		String sql = "Select * from employees";
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSetMetaData rms = ps.getMetaData();
	ResultSet rs = ps.executeQuery();
	System.out.println(rms.getColumnName(1)+"  |  "+rms.getColumnName(2)+"  |  "+rms.getColumnName(3)+"  |  "+rms.getColumnName(4) +"  |  "+rms.getColumnName(5));
	System.out.println();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"            |  "+rs.getString(2)+"      |  "+rs.getString(3)+"  |  "+rs.getString(4)+"  |  "+rs.getFloat(5));
		cnt++;
	}
	return cnt;

}
	
	public int doInsert(Employee e) throws Exception{
		
		int cnt = 0;
		
		Connection conn = LMSDBUtil.getConnection();
		String sql = "Insert into employees values(?,?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpfname());
		ps.setString(3, e.getEmplname());
		ps.setString(4, e.getEmpemail());
		ps.setFloat(5, e.getSalary());
		cnt = ps.executeUpdate();
		return cnt;
	}
	
public int doUpdate(Employee e1) throws Exception{
		
		int cnt = 0;
		
		Connection conn = LMSDBUtil.getConnection();
		String sql = "update employees set first_name=?, last_name=?, email=?, salary=? where employee_id=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setString(1, e1.getEmpfname());
		ps.setString(2, e1.getEmplname());
		ps.setString(3, e1.getEmpemail());
		ps.setFloat(4, e1.getSalary());
		ps.setInt(5, e1.getEmpid());
		cnt = ps.executeUpdate();
		return cnt;
	}

	public int doDelete(int del) throws Exception{
		
		int cnt = 0;
		
		Connection conn = LMSDBUtil.getConnection();
		
		String sql = "delete from employees where employee_id = "+del;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		cnt = ps.executeUpdate();
		return cnt;
	}
	
	public int doFind(int fin) throws Exception{
		
		int cnt = 0;
		
		Connection conn = LMSDBUtil.getConnection();
		
		String sql = "select * from employees where employee_id = "+fin;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"  |  "+rms.getColumnName(2)+"  |  "+rms.getColumnName(3)+"  |  "+rms.getColumnName(4) +"  |  "+rms.getColumnName(5));
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"            |  "+rs.getString(2)+"      |  "+rs.getString(3)+"  |  "+rs.getString(4)+"  |  "+rs.getFloat(5));
			cnt++;
		}
		return cnt;
	}
	
	public String doFindFname(String fin) throws Exception{
		
		String cnt = "";
		
		Connection conn = LMSDBUtil.getConnection();
		
		String sql = "select * from employees where first_name = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ps.setString(1, fin);
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"  |  "+rms.getColumnName(2)+"  |  "+rms.getColumnName(3)+"  |  "+rms.getColumnName(4) +"  |  "+rms.getColumnName(5));
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"            |  "+rs.getString(2)+"      |  "+rs.getString(3)+"  |  "+rs.getString(4)+"  |  "+rs.getFloat(5));
		}
		return cnt;
	}
	
	
	
}
