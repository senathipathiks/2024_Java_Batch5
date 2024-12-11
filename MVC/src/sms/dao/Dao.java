package sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import sms.bean.Student;
import util.dbutil;

public class Dao {

	
public  int  viewAll() throws SQLException {
		
		Connection con1 =dbutil.getConnection();
		int cnt=0;
		String sql  = "Select * from student";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"\t"+rms.getColumnName(2)+"\t \t"+rms.getColumnName(3)+"\t"+rms.getColumnName(4));
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			cnt++;
		}
		return cnt;
	}

	public int doinsert(Student e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = dbutil.getConnection();
		String sql  = "Insert into student values(?,?,?,?)";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setInt(1, e.getStdid());
		ps.setString(2, e.getStdname());
		ps.setInt(3, e.getTotmarks());
		ps.setString(4, e.getDept());
		cnt = ps.executeUpdate();
		return cnt;
	}
	
	public int doupdate(Student e) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = dbutil.getConnection();
		String sql  = "update  student set sname=?,Marks=?,department=? where sno= ?";
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		
		ps.setString(1,  e.getStdname());
		ps.setInt(2, e.getTotmarks());
		ps.setString(3, e.getDept());
		ps.setInt(4, e.getStdid());
		cnt = ps.executeUpdate();
		return cnt;
	}

	public int dodelete(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = dbutil.getConnection();
		String sql  = "delete from student where sno = "+id;
		int cnt=0;
		PreparedStatement ps = con1.prepareStatement(sql);
		
		cnt = ps.executeUpdate();
		return cnt;
	}

	public int dofind(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = dbutil.getConnection();
		int cnt=0;
		String sql  = "Select * from student where sno = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"\t"+rms.getColumnName(2)+"\t \t"+rms.getColumnName(3)+"\t"+rms.getColumnName(4));
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			cnt++;
		}
		return cnt;
	}
	
	public int dofindbyName(String sname) throws SQLException {
		// TODO Auto-generated method stub
		Connection con1 = dbutil.getConnection();
		int cnt=0;
		String sql  = "Select * from student where sname = ?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rms = ps.getMetaData();
		ps.setString(1, sname);
		ResultSet rs = ps.executeQuery();
		System.out.println(rms.getColumnName(1)+"\t"+rms.getColumnName(2)+"\t \t"+rms.getColumnName(3)+"\t"+rms.getColumnName(4));
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			cnt++;
		}
		return cnt;
	}
	
	
}
