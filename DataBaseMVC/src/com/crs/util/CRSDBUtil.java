package com.crs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CRSDBUtil {
	
	public static Connection getConnection() throws SQLException
	{
		final String URL = "jdbc:mysql://localhost:3306/crs_database";
		final String User = "root";
		final String pass = "root";
		
		Connection con = DriverManager.getConnection(URL,User,pass);
		return con;
	}

}
