package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.jsp.bean.Donor;
import com.jsp.util.DonorUtil;

public class DonorDao {
	
	public int viewAll()throws SQLException
	{
		Connection con1=DonorUtil.getConnection();
		int count=0;
		String sql="Select * from donor";
		PreparedStatement ps= con1.prepareStatement(sql);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			count++;
		}
		con1.close();
		return count;
	}
	public int doInsert(Donor e)throws SQLException
	{
		Connection con1=DonorUtil.getConnection();
		String sql="insert into donor values(?,?,?,?)";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, e.getdonorid());
		ps.setString(2, e.getdonorname());
		ps.setString(3, e.getdonorbg());
		ps.setString(4, e.getdonorphoneno());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Donor e)throws SQLException
	{
		Connection con1=DonorUtil.getConnection();
		String sql="update donor set donorname=?,donorbg=?,donorphoneno=? where donorid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		
		ps.setString(1, e.getdonorname());
		ps.setString(2, e.getdonorbg());
		ps.setString(3, e.getdonorphoneno());
		ps.setInt(4, e.getdonorid());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(int id)throws SQLException
	{
		Connection con1=DonorUtil.getConnection();
		String sql="delete from donor where donorid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1,id);
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public Donor doFind(int id)throws SQLException
	{
		Connection con1=DonorUtil.getConnection();
		String sql="select * from donor where donorid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
//		ResultSetMetaData rms=ps.getMetaData();
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Donor e=null;
		while(rs.next())
		{
			e=new Donor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
		}
		System.out.println(e);
		con1.close();
		return e;
	}
	public LinkedList doFindAll() throws SQLException {
		Connection con1=DonorUtil.getConnection();
		LinkedList<Donor> list=new LinkedList<Donor>();
		String sql="select * from donor";
		PreparedStatement ps=con1.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Donor e=new Donor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			list.add(e);
		}
		con1.close();
		return list;
	}

}
