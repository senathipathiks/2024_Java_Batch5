package JDBC_Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		final String URL ="jdbc:mysql://localhost:3306/furnituremanagementsystem";
		final String User = "root";
		final String Password = "root";
		String sql = "select * from customer_details";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL,User,Password);
			
//			Statement stmt = con.createStatement();
//			
//			ResultSet rs = stmt.executeQuery(sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}