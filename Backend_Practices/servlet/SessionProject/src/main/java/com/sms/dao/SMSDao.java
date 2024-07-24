package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.catalina.connector.Response;

import com.sms.bean.Student;
import com.sms.util.SMSUtil;

public class SMSDao {

	public LinkedList viewAll() throws  Exception{

		Connection conn = SMSUtil.getConnection();
		String sql = "Select * from stud";
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSetMetaData rms = ps.getMetaData();
	ResultSet rs  = ps.executeQuery();
	
	LinkedList<Student> list = new LinkedList<Student>();
	while(rs.next()) {	

		Student stu = new Student();
		stu.setStudid(rs.getString(1));
		stu.setStudName(rs.getString(2));
		stu.setStudEmail(rs.getString(3));
		stu.setPassword(rs.getString(4));
		
		list.add(stu);
	}
	return list;
}
	
	
	public int doInsert(Student e) throws Exception{
		
		int cnt = 0;
		
		Connection conn = SMSUtil.getConnection();
		String sql = "insert into stud values(?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, e.getStudid());
		ps.setString(2, e.getStudName());
		ps.setString(3, e.getStudEmail());
		ps.setString(4, e.getPassword());
		cnt = ps.executeUpdate();
		conn.close();
		return cnt;
	}
	
public int doUpdate(Student e) throws Exception{
		
		int cnt = 0;
		
		Connection conn = SMSUtil.getConnection();
		String sql = "update stud set Stud_Name=?, Stud_Email=?, Stud_Password=? where Stud_Id=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setString(1, e.getStudName());
		ps.setString(2, e.getStudEmail());
		ps.setString(3, e.getPassword());
		ps.setString(4, e.getStudid());
		
		cnt = ps.executeUpdate();
		
		conn.close();
		return cnt;
	}
//
	public int doDelete(String del) throws Exception{
		
		int cnt = 0;
		
		Connection conn = SMSUtil.getConnection();
		
		String sql = "delete from stud where Stud_Id = "+del;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		cnt = ps.executeUpdate();
		return cnt;
	}
//	
	public LinkedList<Student> doFind(String fin) throws Exception{
		
		
		Connection conn = SMSUtil.getConnection();
		
		String sql = "select * from stud where Stud_Id = "+fin;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		LinkedList<Student> list = new LinkedList<Student>();
		while(rs.next()) {	

			Student stu = new Student();
			stu.setStudid(rs.getString(1));
			stu.setStudName(rs.getString(2));
			stu.setStudEmail(rs.getString(3));
			stu.setPassword(rs.getString(4));
			
			list.add(stu);
		}
		
		return list;
	}
//	
//	public String doFindFname(String fin) throws Exception{
//		
//		String cnt = "";
//		
//		Connection conn = LMSDBUtil.getConnection();
//		
//		String sql = "select * from employees where first_name = ?";
//		
//		PreparedStatement ps = conn.prepareStatement(sql);
//		ResultSetMetaData rms = ps.getMetaData();
//		ps.setString(1, fin);
//		ResultSet rs = ps.executeQuery();
//		System.out.println(rms.getColumnName(1)+"  |  "+rms.getColumnName(2)+"  |  "+rms.getColumnName(3)+"  |  "+rms.getColumnName(4) +"  |  "+rms.getColumnName(5));
//		System.out.println();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"            |  "+rs.getString(2)+"      |  "+rs.getString(3)+"  |  "+rs.getString(4)+"  |  "+rs.getFloat(5));
//		}
//		return cnt;
//	}

	

	
	
	
	
}

