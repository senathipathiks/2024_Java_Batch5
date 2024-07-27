package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/creche";
		final String user = "root";
		final String pass = "root";
		String sql = "select * from admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(URL,user,pass);
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
