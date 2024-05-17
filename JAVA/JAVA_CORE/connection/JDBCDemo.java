package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/ani";
		final String user="root";
		final String pass="Admin@123";
		String sql="Select * from student ";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,user,pass);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
