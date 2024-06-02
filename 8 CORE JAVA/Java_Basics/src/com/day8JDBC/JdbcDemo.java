package com.day8JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;





public class JdbcDemo {
	public static void main(String args[]) {
		final String URL = "jdbc:mysql://localhost:3306/gk";
		final String User = "root";
		final String pass = "root";
		String sql = "select * from customers";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL, User, pass);
			
//			Statement stmt =con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql); 
			
//			ResultSet rs = stmt.executeQuery(sql);
			ResultSet rs = ps.executeQuery();

			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
