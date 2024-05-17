package day8_StreamsJava;

import java.sql.*;


public class Demo_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         final String url = "jdbc:mysql://localhost:3306/crm";
         final String user = "root";
         final String pwd = "Password@12345";
         String sql  = "select * from criminal";
         try {	
        	 
        	 Connection con = DriverManager.getConnection(url, user, pwd);
        	 
        	 Statement st = con.createStatement();
        	 
        	 ResultSet rs = st.executeQuery(sql);
        	 
        	 while(rs.next()) {
        		 System.out.println(rs.getInt(1)+" "+rs.getString(2));
        		 
        	 }
        	 con.close();
        	 
        	 
         }
         catch (Exception e) {
			// TODO: handle exception
        	 System.out.println(e);
		}
	}

}
