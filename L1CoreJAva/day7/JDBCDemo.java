package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/nalan";
		final String User="root";
		final String pass="root";
		String sql = "select * from employee where gender='F'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,User,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
