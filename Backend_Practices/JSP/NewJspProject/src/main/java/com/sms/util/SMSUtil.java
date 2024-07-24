package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SMSUtil {
	public static Connection getConnection() throws Exception {

		final String URL = "jdbc:mysql://localhost:3306/student";
		final String user = "root";
		final String pass = "root";
		Connection con = DriverManager.getConnection(URL, user, pass);
		return con;
	}

}
