package com.payroll.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.payroll.bean.Leave;
import com.payroll.util.Payrolldbutil;

import java.sql.ResultSetMetaData;


public class PayrollDAO {
	
	public int viewAll() throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from leave_tbl";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int Insert(Leave e) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		String sql = "insert into leave_tbl values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getLid());
		ps.setInt(2, e.getEmpId());
		ps.setString(3,e.getEmpname());
		ps.setString(4, e.getLtype());
		ps.setInt(5, e.getNoOfDays());
		ps.setString(6, e.getFrom_date());
		ps.setString(7, e.getTo_date());
		ps.setString(8, e.getReason());
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int Delete(int id) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		String sql = "Delete from leave_tbl where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int Update(Leave e) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		String sql = "update leave_tbl set Lid=?, empname=?, Ltype=?, noOfDays=?, From_date=?, To_date=?, Reason=? where empid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getLid());
		ps.setString(2,e.getEmpname());
		ps.setString(3, e.getLtype());
		ps.setInt(4, e.getNoOfDays());
		ps.setString(5, e.getFrom_date());
		ps.setString(6, e.getTo_date());
		ps.setString(7, e.getReason());
		ps.setInt(8, e.getEmpId());
		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	
	
	public int FindById(int id) throws SQLException
	{
			
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from Leave_tbl where empid=?";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1,id);
		
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		
		
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	} 
	
	public int FindByName(String Name) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from leave_tbl where empname=?";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,Name);
		
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	}
	
	public int FindLeaveDate(String dept) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from leave_tbl where From_date=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,dept);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	} 
	public int FindByReason(String reason) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from leave_tbl where Reason=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,reason);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	} 
	public int FindByLeaveType(String Ltype) throws SQLException
	{
		Connection con1 = Payrolldbutil.getConnection();
		int count = 0;
		String sql = "Select * from leave_tbl where Ltype=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,Ltype);
		ResultSetMetaData rms =  ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6)+" "+rms.getColumnName(7)+" "+rms.getColumnName(8));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"       "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
			count++;
		}
		con1.close();
		return count;
	} 
	
}
