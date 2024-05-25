package com.ims.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IMSUtil {
	public static Connection getConnection() throws SQLException {
		final String url = "jdbc:mysql://localhost:3306/ims_db";
		final String user = "root";
		final String pass = "Srienath123@V";
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

}