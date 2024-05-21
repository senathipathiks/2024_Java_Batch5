package com.obcps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.obcps.bean.People;
import com.obcps.util.OBCPSUtil;

public class OBCPSDAO {
	int count=0;

	public int viewAll() throws SQLException
	{
		Connection con1 = OBCPSUtil.getConnection();
		String sql="Select * from people_tbl";
		PreparedStatement ps=con1.prepareStatement(sql);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6));
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			count++;
		}
		return count;
	}
	public int doInsert(People e) throws SQLException
	{
		Connection con1 = OBCPSUtil.getConnection();
		String sql="insert into people_tbl values (?,?,?,?,?,?)";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, e.getFatherName());
		ps.setString(2, e.getMotherName());
		ps.setString(3, e.getChildName());
		ps.setString(4, e.getGender());		
		ps.setString(5, e.getTimeOfBirth());
		ps.setString(6, e.getPlaceOfBirth());

		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(People e) throws SQLException
	{
		Connection con1 = OBCPSUtil.getConnection();
		String sql="update people_tbl set fatherName=?,motherName=?,gender=?,timeOfBirth=?,placeOfBirth=? where childName=? ";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, e.getFatherName());
		ps.setString(2, e.getMotherName());
		ps.setString(3, e.getGender());		
		ps.setString(4, e.getTimeOfBirth());
		ps.setString(5, e.getPlaceOfBirth());
		ps.setString(6, e.getChildName());
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doDelete(String childName) throws SQLException
	{
		Connection con1 = OBCPSUtil.getConnection();
		String sql="delete from people_tbl where childName=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, childName);
		
		int n=ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doFindByName(String name) throws SQLException
	{
		Connection con1 = OBCPSUtil.getConnection();
		String sql="Select * from people_tbl where childName=?";
		PreparedStatement ps=con1.prepareStatement(sql);
		ps.setString(1, name);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4)+" "+rms.getColumnName(5)+" "+rms.getColumnName(6));
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			count++;
		}
		return count;
	}
	
}
