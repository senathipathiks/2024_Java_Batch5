package com.lms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Lmsdbutil {

	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		 final String url = "jdbc:mysql://localhost:3306/lms";
         final String user = "root";
         final String pwd = "Password@12345";
         Connection con = DriverManager.getConnection(url,user,pwd);
         return con;
	}

}
