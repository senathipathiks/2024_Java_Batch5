package com.lms.util;

import java.sql.*;

public class LMSDBUtil {

	public static Connection getConnection()throws SQLException {
		
		
		final String URL="jdbc:mysql://localhost:3306/invent_db";
		final String user="root";
		final String pswrd="Password@12345";
		String sql = "select*from pdt_tbl where pdtId=1 ";		
		Connection con=DriverManager.getConnection(URL,user,pswrd);
		return con;
	}

}
