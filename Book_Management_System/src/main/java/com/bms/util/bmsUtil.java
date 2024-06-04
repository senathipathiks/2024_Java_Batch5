package com.bms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bmsUtil {

		public static Connection getConnection() throws SQLException {
			final String url = "jdbc:mysql://localhost:3306/bms_db";
			final String user = "root";
			final String pass = "Prabha123#@!";
			Connection con = DriverManager.getConnection(url,user,pass);
			return con;
		}

}
