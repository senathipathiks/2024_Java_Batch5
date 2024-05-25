package com.ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ims.bean.Customer;
import com.ims.util.IMSUtil;

public class IMSDAO {

	
	public LinkedList<Customer> viewAll() throws SQLException {
			Connection con1=IMSUtil.getConnection();
			LinkedList<Customer> list=new LinkedList<Customer>();
			String sql="select * from customer_tbl";
			PreparedStatement ps=con1.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Customer c=new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				list.add(c);
			}
			con1.close();
			return list;
		}
	public int doInsert(Customer c) throws SQLException {
		Connection con1 = IMSUtil.getConnection();
		String sql = "insert into customer_tbl values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, c.getCusid());
		ps.setString(2, c.getCusname());
		ps.setString(3, c.getAge());
		ps.setString(4, c.getPhoneNo());
		ps.setString(5, c.getEmailID());
		ps.setString(6, c.getNomineeName());
		ps.setString(7, c.getNomineeRelation());
		ps.setString(8, c.getAddress());

		
		int n = ps.executeUpdate();
		con1.close();		
		return n;	
	}
	public int doUpdate(Customer c) throws SQLException {
		Connection con1 = IMSUtil.getConnection();
		String sql = "Update customer_tbl set cusName=?,age=?,phoneNo=?,emailID=?,nomineeName=?,nomineeRelation=?,address=? where cusID=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, c.getCusname());
		ps.setString(2, c.getAge());
		ps.setString(3, c.getPhoneNo());
		ps.setString(4, c.getEmailID());
		ps.setString(5, c.getNomineeName());
		ps.setString(6, c.getNomineeRelation());
		ps.setString(7, c.getAddress());
		ps.setString(8, c.getCusid());

		
		int n = ps.executeUpdate();
		con1.close();
		return n;
		
	}
	public int doDelete(String id) throws SQLException {
		Connection con = IMSUtil.getConnection();
		String sql = "Delete from customer_tbl where cusID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public Customer doFind(int id) throws SQLException {
		Connection con1=IMSUtil.getConnection();
		String sql="select * from customer_tbl where cusID=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Customer c=null;
		while(rs.next())
		{
			c=new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			
		}
		System.out.println(c);
		con1.close();
		return c;
		
	}
	
	

}