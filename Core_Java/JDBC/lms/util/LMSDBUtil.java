package com.lms.util; //it will return connection objection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSDBUtil { //every operation we have a connection so that we separate the connection
	public static Connection getConnection() throws SQLException {
		final String url = "jdbc:mysql://localhost:3306/lms_db";
		final String user = "root";
		final String pass = "Aravind200317@";
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

}
