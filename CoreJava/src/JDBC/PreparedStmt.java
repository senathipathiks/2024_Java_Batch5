package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmt {
	
public static void main(String[] args) {
		
		final String URL="jdbc:mysql://localhost:3306/fos";
		final String User="root";
		final String pass="root";
		String sql="select * from employee";
		try {
			//Class.forName("com.mysql.jdbc.Driver"); //Depriciated so it shows in red color
			Connection con =DriverManager.getConnection(URL,User,pass);
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
