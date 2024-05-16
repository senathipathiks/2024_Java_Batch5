package com.lms.dao;

import java.sql.*;

import com.lms.bean.pdt;
import com.lms.util.LMSDBUtil;
public class LMSDAO {

	public int viewAll() throws SQLException {
		Connection con1=LMSDBUtil.getConnection();
		int count=0;
		String sql="select* from pdt_tbl";
		PreparedStatement ps= con1.prepareStatement(sql);
		ResultSetMetaData rms=ps.getMetaData();
		ResultSet rs=ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"  "+rms.getColumnName(2)+"  "+rms.getColumnName(3)+"  "+rms.getColumnName(4)+"  ");
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+ rs.getString(4)+" ");
			count++;
		}
		
		return count;
	}
	
	// insertion 
	
	public int doInsert(pdt e) throws SQLException {
		
		Connection con1=LMSDBUtil.getConnection();
		String sql="insert into pdt_tbl values(?,?,?,?)";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1,e.getpdtId());
		ps.setString(2,e.getpdtName());
		ps.setString(3,e.getpdtBrand());
		ps.setString(4,e.getpdtCategory());
		
		int n = ps.executeUpdate();
		
		
		return n;
	}
	
	
	// updation 
	
	public int update(pdt e) throws SQLException {
		
		Connection con1=LMSDBUtil.getConnection();
		String sql="update pdt_tbl set pdtName=?,pdtDesg=?,pdtDept=? where pdtID=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		
		ps.setString(1,e.getpdtName());
		ps.setString(2,e.getpdtBrand());
		ps.setString(3,e.getpdtCategory());
		ps.setInt(4,e.getpdtId());
		
		int n = ps.executeUpdate();
		
		con1.close();
		return n;
	}
	//deletion
	
	public int delete(int id) throws SQLException {
		
		Connection con1=LMSDBUtil.getConnection();
		String sql="delete from pdt_tbl where pdtID=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n=ps.executeUpdate();
		con1.close();
		
		return n;
	
	}

	public int find(int id) throws SQLException {
		
		Connection con1=LMSDBUtil.getConnection();
		int count=0;
		String sql="select* from pdt_tbl where pdtID=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet n = ps.executeQuery();
	while(n.next()) 
		{
			count++;
		}
		
		return count;
	
	}
	
// Finding using name 	
//	public int find(String name) throws SQLException {
//		
//		Connection con1=LMSDBUtil.getConnection();
//		int count=0;
//		String sql="select* from pdt_tbl where pdtName=?";
//		PreparedStatement ps= con1.prepareStatement(sql);
//		ps.setString(1,name);
//		ResultSet n = ps.executeQuery();
//		while(n.next()) 
//		{
//			System.out.println(n.getInt(1)+" "+ n.getString(2)+" "+ n.getString(3)+" "+ n.getString(4)+" ");
//			count++;
//		}
//		
//		return count;
//	
//	}
	}

