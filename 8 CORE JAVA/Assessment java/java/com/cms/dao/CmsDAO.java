package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.cms.bean.Employees;
import com.cms.util.CmsDBUtil;



public class CmsDAO {
	
	public int doInsert(Employees e) throws SQLException {	
		Connection con1 = CmsDBUtil.getConnection();
		String sql = "insert into cust_tbl values(?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, e.getEid());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getEdesig());
		int n = ps.executeUpdate();
		con1.close();
		return n;
}
	public int doUpdate(Employees e) throws SQLException {
		Connection con1 = CmsDBUtil.getConnection();
		String sql = "update cust_tbl set Ename=?,Edesig=? where Eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, e.getEname());
		ps.setString(2, e.getEdesig());
		ps.setInt(3, e.getEid());
		int n = ps.executeUpdate();
//		con1.close();
		return n;
		}
	
	public int doDelete(int id) throws SQLException {
		Connection con1 = CmsDBUtil.getConnection();
//		System.out.println("Inside funciton");
		String sql = "delete from cust_tbl where Eid=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);
		int n = ps.executeUpdate();
		con1.close();
		return n;
		}
	
	public Employees doFind(int id) throws SQLException {
		Connection con1=CmsDBUtil.getConnection();
				String sql="select * from cust_tbl where Eid=?";
				PreparedStatement ps= con1.prepareStatement(sql);
				ResultSetMetaData rms=ps.getMetaData();
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				Employees e=null;
				while(rs.next())
				{
					e=new Employees(rs.getInt(1),rs.getString(2),rs.getString(3));
					
				}
				System.out.println(e);
				con1.close();
				return e;
	}
	public LinkedList doFindAll() throws SQLException{
		Connection con1=CmsDBUtil.getConnection();
		LinkedList<Employees> list = new LinkedList<Employees>();
		String sql="select * from cust_tbl";
		PreparedStatement ps= con1.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Employees e = new Employees(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(e);
		}
		con1.close();
		return list;
	}
}
