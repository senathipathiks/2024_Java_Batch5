package com.lms.util;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class LMSDBUtil {
public static Connection getConnection() throws SQLException
{
	final String URL="jdbc:mysql://localhost:3306/lms_db";
	final String User="root";
	final String pass="Password@12345";
	Connection con=DriverManager.getConnection(URL,User,pass);
	return con;
}
}
