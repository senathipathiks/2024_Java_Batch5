package com.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Preparedstatement {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/finance";
		final String user = "root";
		final String pass = "Aravind200317@";
		String sql = "select * from tbl_budget where b_id=301";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getDouble(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
