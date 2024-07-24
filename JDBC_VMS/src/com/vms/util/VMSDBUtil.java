package com.vms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VMSDBUtil 
{
	public static Connection getConnection() throws SQLException
	   {
		   final String URL="jdbc:mysql://localhost:3306/vms_db";
		   final String User="root";
		   final String pass="Admin@123";
		   Connection con=DriverManager.getConnection(URL,User,pass);
		   return con;
	   }
}
