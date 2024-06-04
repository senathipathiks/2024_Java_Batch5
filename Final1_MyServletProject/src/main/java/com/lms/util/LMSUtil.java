package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSUtil {
	public static Connection getConnection() throws SQLException {
		final String url = "jdbc:mysql://localhost:3306/lms_db";
		final String user = "root";
		final String pass = "Prabha123#@!";
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

}
