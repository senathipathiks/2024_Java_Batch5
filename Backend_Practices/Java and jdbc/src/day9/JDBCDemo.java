package day9;

import java.sql.*;


public class JDBCDemo {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/weatherforecast";
		final String user = "root";
		final String pass = "root";
		String sql = "select * from weather_data";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(URL, user, pass);
			
			Statement stat = conn.createStatement();
			
//			PreparedStatement statement = conn.prepareStatement(sql);
			
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "   " + rs.getInt(1) + "   " + rs.getString(3) + "  " + rs.getFloat(4) + "  " + rs.getFloat(5) + "  " + rs.getFloat(6) + "  " + rs.getString(7) + "  " + rs.getFloat(8) + "  " + rs.getFloat(9) + "  " + rs.getString(10));
			}
			conn.close();
		} catch (Exception e) {
			
			
		}
	}

}
