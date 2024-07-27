package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Demo 
{
	public static void main(String[] args) 
	{
		final String URL = "jdbc:mysql://localhost:3306/ams";
		final String user = "root";
		final String pass = "Admin@123";
		String sql = "select * from usr_tbl";
		try
		{
//			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL, user, pass);
			
//			Statement stmt = con.createStatement();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " + rs.getString(4));
			}
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
