package com.tms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.tms.bean.Trainnee;
import com.tms.util.TMSDBUtil;
import com.tms.bean.Trainnee;
import com.tms.util.TMSDBUtil;

public class TMSDAO 
{
	public int doInsert(Trainnee e) throws SQLException
	   {
		   Connection con1=TMSDBUtil.getConnection();
		   //int count=0;
		   String sql="insert into Trainee values(?,?,?,?)";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   ps.setString(1, e.getTraineeid());
		   ps.setString(2, e.getTraineename());
		   ps.setString(3, e.getTraineedept());
		   ps.setString(4,e.getTrainingrole());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	public int dodelete(String id1) throws SQLException
	   {
		   Connection con1=TMSDBUtil.getConnection();
		   String sql="delete from Trainee where traineeid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setString(1,id1);
		 
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	
	 public int doUpdate(Trainnee e) throws SQLException
	   {
		   Connection con1=TMSDBUtil.getConnection();
		   String sql="update Trainee set traineename=?,traineedept=?,trainingrole=? where traineeid=?";
		   PreparedStatement ps=con1.prepareStatement(sql);
		   
		   ps.setString(1, e.getTraineename());
		   ps.setString(2, e.getTraineedept());
		   ps.setString(3, e.getTrainingrole());
		   ps.setString(4, e.getTraineeid());
		   int n=ps.executeUpdate();
		   con1.close();
		   return n;
	   }
	 
	 public Trainnee doFind(String id) throws SQLException {
		Connection con = TMSDBUtil.getConnection();
		System.out.println("Inside");
		String sql = "Select * from Trainee where traineeid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		Trainnee e1 = null;
		if (rs.next()) {
			e1 = new Trainnee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		System.out.println(e1);
		con.close();
		return e1;

	}
	 
	 public LinkedList doView() throws SQLException{
			Connection con = TMSDBUtil.getConnection();
			LinkedList<Trainnee> list = new LinkedList<>();
			String sql = "select * from Trainee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Trainnee e2 = new Trainnee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(e2);
			}
			
			
			
			return list;
			
	 }
}