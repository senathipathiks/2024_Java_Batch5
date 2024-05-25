package com.osm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OsmDbUtil {
	public static Connection getConnection() throws SQLException{
		String URL = "jdbc:mysql://localhost:3306/osm";
		String user = "root";
		String pass = "root";
		
		Connection con = DriverManager.getConnection(URL, user, pass);
		
		return con;
	}
}
