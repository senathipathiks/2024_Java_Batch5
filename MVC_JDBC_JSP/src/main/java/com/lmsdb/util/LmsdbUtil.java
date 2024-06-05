package com.lmsdb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class LmsdbUtil {

	public static Connection getConnection() throws  SQLException {
		
		final String URL ="jdbc:mysql://localhost:3306/lms_db";
		final String User = "root";
		final String Password = "root";
		
		Connection con = DriverManager.getConnection(URL,User,Password);
		return con;

		
	}
}
