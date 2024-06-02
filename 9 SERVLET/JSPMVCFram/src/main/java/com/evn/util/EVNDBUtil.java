package com.evn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EVNDBUtil {

	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/EMS";
		final String User="root";
		final String pass="root";
		Connection con = DriverManager.getConnection(URL,User,pass);
		return con;
}
}
