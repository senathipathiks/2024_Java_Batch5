package com.visitor.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VisitorDBUtil {
	public static Connection getConnection() throws SQLException{
		final String URL = "jdbc:mysql://localhost:3306/visitor_db";
		final String User = "root";
		final String pass = "root";
		Connection conn = DriverManager.getConnection(URL,User,pass);
		return conn;
	}
}