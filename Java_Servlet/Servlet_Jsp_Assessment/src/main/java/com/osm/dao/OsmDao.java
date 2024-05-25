package com.osm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.osm.bean.Member;
import com.osm.util.OsmDbUtil;


public class OsmDao {
	public ArrayList<Member> viewAll() throws SQLException {
		Connection con1 = OsmDbUtil.getConnection();
		int count = 0;
		String sql = "Select * from Member";
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
		ArrayList<Member> al = new ArrayList<Member>();
		
		while(rs.next()) {
			Member mem = new Member();
			
			mem.setId(rs.getInt(1));
			mem.setName(rs.getString(2));
			mem.setLocation(rs.getString(3));
			mem.setEmail(rs.getString(4));
			mem.setTotalSurveytaken(rs.getInt(5));
			
			al.add(mem);
		}

		return al;
	}

	public int insert(Member m) throws SQLException {
		Connection con1 = OsmDbUtil.getConnection();
		int count = 0;
		String sql = "insert into Member values(?,?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setInt(1, m.getId());
		ps.setString(2, m.getName());
		ps.setString(3, m.getLocation());
		ps.setString(4, m.getEmail());
		ps.setInt(5, m.getTotalSurveytaken());

		count = ps.executeUpdate();

		return count;
	}

	public int update(Member m) throws SQLException {
		Connection con1 = OsmDbUtil.getConnection();
		int count = 0;
		String sql = "update Member set name=?, location=?, email=?, totalSurveyTaken=? where id=?";
		PreparedStatement ps = con1.prepareStatement(sql);

		ps.setString(1, m.getName());
		ps.setString(2, m.getLocation());
		ps.setString(3, m.getEmail());
		ps.setInt(4, m.getTotalSurveytaken());
		ps.setInt(5, m.getId());

		count = ps.executeUpdate();

		return count;
	}

	public int delete(int id) throws SQLException {
		Connection con1 = OsmDbUtil.getConnection();
		int count = 0;
		String sql = "delete from Member where id=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setInt(1, id);

		count = ps.executeUpdate();

		return count;
	}

	public ArrayList<Member> find(int id) throws SQLException {
		Connection con1 = OsmDbUtil.getConnection();
		int count = 0;
		String sql = "select * from Member where id = ?";
		PreparedStatement ps = con1.prepareStatement(sql);

		ResultSetMetaData rsmd = ps.getMetaData();
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

//		System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2) + "\t" + rsmd.getColumnName(3) + "\t"
//				+ rsmd.getColumnName(4) + "\n");
//
//		while (rs.next()) {
//			System.out.println(
//					rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\n");
//			count++;
//		}
		
		ArrayList<Member> al = new ArrayList<Member>();
		
		while(rs.next()) {
			Member mem = new Member();
			
			mem.setId(rs.getInt(1));
			mem.setName(rs.getString(2));
			mem.setLocation(rs.getString(3));
			mem.setEmail(rs.getString(4));
			mem.setTotalSurveytaken(rs.getInt(5));
			
			al.add(mem);
		}

		return al;
	}
}
