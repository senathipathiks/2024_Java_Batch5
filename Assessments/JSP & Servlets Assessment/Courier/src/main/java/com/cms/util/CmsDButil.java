package com.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CmsDButil {
	public static Connection getConnection() throws SQLException{
		final String URL="jdbc:mysql://localhost:3306/courier";
		final String user="root";
		final String pass="root";
		Connection con = DriverManager.getConnection(URL,user,pass);
		return con;
	}
}
