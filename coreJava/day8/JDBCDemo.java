package com.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		final String URL="jdbc:mysql://localhost:3306/sms_db";
		final String user="root";
		final String pswrd="Password@12345";
		String sql = "select*from student where studno=121";
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,user,pswrd);
		   // Statement stmt=con.createStatement();
		    PreparedStatement ps= con.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery(sql);
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+ rs.getInt(5)+" "+rs.getString(6));
		    }
		    con.close();
		    
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
