package com.bms.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.bms.bean.books;
import com.bms.util.bmsUtil;

public class bmsDAO {

	
	public LinkedList viewAll() throws SQLException {
			Connection con1=bmsUtil.getConnection();
			LinkedList<books> lists=new LinkedList<books>();
			String sql="select * from books_details";
			PreparedStatement ps=con1.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				books b1=new books(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				lists.add(b1);
			}
			con1.close();
			return lists;
		}
	public int doInsert(books b) throws SQLException {
		Connection con = bmsUtil.getConnection();
		String sql = "Insert into books_details values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, b.getBookid());
		ps.setString(2, b.getBookname());
		ps.setString(3, b.getBookauthor());
		ps.setString(4, b.getBookdateofbuy());
		
		int n = ps.executeUpdate();
		con.close();
		
		return n;
		
	}
	public int doUpdate(books e) throws SQLException {
		Connection con = bmsUtil.getConnection();
		String sql = "Update books_details set Bookname=?,Bookauthor=?,Bookdateofbuy=? where Bookid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, e.getBookname());
		ps.setString(2, e.getBookauthor());
		ps.setString(3, e.getBookdateofbuy());
		ps.setInt(4, e.getBookid());
		
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public int doDelete(int id) throws SQLException {
		Connection con = bmsUtil.getConnection();
		String sql = "Delete from books_details where Bookid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		int n = ps.executeUpdate();
		con.close();
		return n;
		
	}
	public books doFind(int id) throws SQLException {
		Connection con1=bmsUtil.getConnection();
		String sql="select * from books_details where Bookid=?";
		PreparedStatement ps= con1.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		books w=null;
		while(rs.next())
		{
			w=new books(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
		}
		System.out.println(w);
		con1.close();
		return w;
		
	}
	
	


}
