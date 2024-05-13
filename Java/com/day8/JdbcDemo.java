package com.day8;

import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/sms_db";
		String user = "root";
		String pass = "root";
		String query = "select * from employees";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL, user, pass);
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
