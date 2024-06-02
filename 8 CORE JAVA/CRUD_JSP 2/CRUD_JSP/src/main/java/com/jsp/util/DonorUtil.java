package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DonorUtil {
	public static Connection getConnection()throws SQLException
	{
		final String URL="jdbc:mysql://localhost:3306/bb";
		final String User="root";
		final String pass="root";
		Connection con=DriverManager.getConnection(URL,User,pass);
		return con;
	}

}
