package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.cms.util.CMSDBUtil;


public class CMSDAO 
{
	public int viewAll() throws SQLException
	   {
		   Connection con1=CMSDBUtil.getConnection();
		   int count=0;
		   String sql="Select*from Courier";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ResultSetMetaData rms=ps.getMetaData();
		   ResultSet rs=ps.executeQuery();
		   System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3)+" "+rms.getColumnName(4));
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" ");
			   count++;
		   }
		   con1.close();
		   return count;
		   
	   }
}
