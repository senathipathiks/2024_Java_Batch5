package Synchronization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL="jdbc:mysql://localhost:3306/shopping ";
		final String User="root";
		final String pass="madhan@28";
		String sql="select * from product";
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL,User,pass);
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
