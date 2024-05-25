package com.sms.dao;


import com.sms.bean.Student;
import com.sms.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class SmsDao {
	public ArrayList<Student> viewAll() throws SQLException {
		Connection con1 = SmsDbUtil.getConnection();
		int count = 0;
		String sql = "Select * from student";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rsmd = ps.getMetaData();
		ResultSet rs = ps.executeQuery();

//		System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2) + "\t" + rsmd.getColumnName(3) + "\t"
//				+ rsmd.getColumnName(4) + "\n");

//		while (rs.next()) {
//			System.out.println(
//					rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\n");
//			count++;
//		}
		ArrayList<Student> al = new ArrayList<Student>();
		
		while(rs.next()) {
			Student stu = new Student();
			
			stu.setStuid(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setCity(rs.getString(3));
			stu.setMobile(rs.getString(4));
			
			al.add(stu);
		}

		return al;
	}

	public int insert(Student s) throws SQLException {
		Connection con1 = SmsDbUtil.getConnection();
		int count = 0;
		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setInt(1, s.getStuid());
		ps.setString(2, s.getName());
		ps.setString(3, s.getCity());
		ps.setString(4, s.getMobile());

		count = ps.executeUpdate();

		return count;
	}

	public int update(Student s) throws SQLException {
		Connection con1 = SmsDbUtil.getConnection();
		int count = 0;
		String sql = "update student set sname=?, scity=?, smobile=? where sno=?";
		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, s.getName());
		ps.setString(2, s.getCity());
		ps.setString(3, s.getMobile());
		ps.setInt(4, s.getStuid());

		count = ps.executeUpdate();

		return count;
	}

	public int delete(int id) throws SQLException {
		Connection con1 = SmsDbUtil.getConnection();
		int count = 0;
		String sql = "delete from student where sno=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);

		count = ps.executeUpdate();

		return count;
	}

	public ArrayList<Student> find(int id) throws SQLException {
		Connection con1 = SmsDbUtil.getConnection();
		int count = 0;
		String sql = "select * from student where sno = " + id;
		PreparedStatement ps = con1.prepareStatement(sql);

		ResultSetMetaData rsmd = ps.getMetaData();
		ResultSet rs = ps.executeQuery();

//		System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2) + "\t" + rsmd.getColumnName(3) + "\t"
//				+ rsmd.getColumnName(4) + "\n");
//
//		while (rs.next()) {
//			System.out.println(
//					rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\n");
//			count++;
//		}
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		while(rs.next()) {
			Student stu = new Student();
			
			stu.setStuid(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setCity(rs.getString(3));
			stu.setMobile(rs.getString(4));
			
			al.add(stu);
		}

		return al;
	}
}
