package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.vms.util.VMSDBUtil;
import com.vms.bean.Vehicle;
import com.vms.util.VMSDBUtil;

public class VMSDAO 
{
	public int viewAll() throws SQLException
	   {
		   Connection con1=VMSDBUtil.getConnection();
		   int count=0;
		   String sql="Select*from Vehicle";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ResultSetMetaData rms=ps.getMetaData();
		   ResultSet rs=ps.executeQuery();
		   System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" ");
			   count++;
		   }
		   con1.close();
		   return count;
		   
	   }
	public int doInsert(Vehicle v) throws SQLException
	   {
		   Connection con1=VMSDBUtil.getConnection();
		   //int count=0;
		   String sql="insert into Vehicle values(?,?,?,?)";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ps.setInt(1, v.getVehicleid());
		   ps.setString(2, v.getVehicleBrandName());
		   ps.setString(3, v.getVehicleOwnerName());
		   ps.setString(4,v.getVehicleServiceList());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	
	public int doUpdate(Vehicle v) throws SQLException
	   {
		   Connection con1=VMSDBUtil.getConnection();
		   String sql="update Vehicle set Vehicleid=?,VehicleBrandName=?,VehicleOwnerName=?,VehicleServiceList=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setInt(1, v.getVehicleid());
		   ps.setString(2, v.getVehicleBrandName());
		   ps.setString(3,v.getVehicleOwnerName());
		   ps.setString(4, v.getVehicleServiceList());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	   
	   public int dodelete(int id) throws SQLException
	   {
		   Connection con1=VMSDBUtil.getConnection();
		   String sql="delete from Vehicle where Vehicleid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setInt(1,id);
		 
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	   public int doFind(int id) throws SQLException
	   {
		   Connection con1=VMSDBUtil.getConnection();
		   int count=0;
		   String sql="select*from Vehicle where Vehicleid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ps.setInt(1,id);
		   ResultSetMetaData rms=ps.getMetaData();
		   ResultSet rs=ps.executeQuery();
		   System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" ");
			   count++;
		   }
		   con1.close();
		   return count;
	   }
}
