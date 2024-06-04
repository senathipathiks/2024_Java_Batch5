package com.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/sms_db";
		final String User = "root";
		final String pass = "root";
		String sql = "select * from tbl_stud";
		try
		{
//			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL,User,pass);
			
			Statement stmt = con.createStatement();
			
//			PreparedStatement ps = con.prepareStatement(sql);
//			
//			ResultSet rs = ps.executeQuery();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}