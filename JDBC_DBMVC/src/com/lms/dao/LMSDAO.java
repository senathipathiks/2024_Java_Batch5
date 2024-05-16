package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lms.bean.Employee;
import com.lms.util.LMSDBUtil;

public class LMSDAO 
{
   public int viewAll() throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   int count=0;
	   String sql="Select*from Emp";
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
   
   public int doInsert(Employee e) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   //int count=0;
	   String sql="insert into Emp values(?,?,?,?)";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   ps.setInt(1, e.getEmpid());
	   ps.setString(2, e.getEmpname());
	   ps.setString(3, e.getEmpdesig());
	   ps.setString(4,e.getEmpdept());
	   int n=ps.executeUpdate();
	   con1.close();
	   return n;
//	   ResultSetMetaData rms=ps.getMetaData();
//	   ResultSet rs=ps.executeQuery();
//	   System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
//	   while(rs.next())
//	   {
//		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" ");
//		   count++;
//	   }
//	   return count;
	   
   }
   
   public int doUpdate(Employee e) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   String sql="update Emp set empname=?,empdesig=?,empdept=?,empid=?";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   
	   ps.setString(1, e.getEmpname());
	   ps.setString(2, e.getEmpdesig());
	   ps.setString(3,e.getEmpdept());
	   ps.setInt(4, e.getEmpid());
	   int n=ps.executeUpdate();
	   con1.close();
	   return n;
   }
   
   public int dodelete(int id) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   String sql="delete from Emp where empid=?";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   
	   ps.setInt(1,id);
	 
	   int n=ps.executeUpdate();
	   con1.close();
	   return n;
   }
   
   public int doFind(int id) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   int count=0;
	   String sql="select*from Emp where empid=?";
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
   
   public int doFindByName(String name) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   int count=0;
	   String sql="select * from Emp where empname=?";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   ps.setString(1, name);
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
   
   public int doFindByDesig(String name) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   int count=0;
	   String sql="select * from Emp where empdesig=?";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   ps.setString(1, name);
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
   
   public int doFindByDept(String name) throws SQLException
   {
	   Connection con1=LMSDBUtil.getConnection();
	   int count=0;
	   String sql="select * from Emp where empdept=?";
	   PreparedStatement ps=con1.prepareStatement(sql);
	   ps.setString(1, name);
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
