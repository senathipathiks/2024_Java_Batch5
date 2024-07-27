package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LmsDButil {
	public static Connection getConnection() throws SQLException{
		final String URL="jdbc:mysql://localhost:3306/lms_db";
		final String user="root";
		final String pass="root";
		Connection con = DriverManager.getConnection(URL,user,pass);
		return con;
	}
}
