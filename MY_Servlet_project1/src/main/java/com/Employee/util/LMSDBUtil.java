package com.Employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSDBUtil {
	public static Connection getConnection() throws SQLException {

		final String URL = "jdbc:mysql://localhost:3306/lms_db";
		final String User = "root";
		final String password = "Prabha123#@!";
		Connection con = DriverManager.getConnection(URL, User, password);
		return con;
	}
}