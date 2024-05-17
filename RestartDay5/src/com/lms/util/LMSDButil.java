package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSDButil 
{
	public static Connection getConnection() throws SQLException
	{
		final String URL = "jdbc:mysql://localhost:3306/LMS";
		final String user = "root";
		final String pass = "Admin@123";
		Connection con = DriverManager.getConnection(URL, user, pass);
		return con;
	}
}
