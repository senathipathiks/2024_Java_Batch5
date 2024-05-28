<%@page import="java.sql.SQLException"%>
<%@page import="com.car.bean.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.car.dao.CarDAO" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>
<%
	CarDAO car = new CarDAO();
	int count=0;
	try{
		ArrayList<Car> li = car.viewAll();
		
		out.print("<center><table border=2>");
		out.print("<tr>");
		out.print("<th>Car ID<th>");
		out.print("<th>BrandName<th>");
		out.print("<th>Modal<th>");
		out.print("<th>Price<th>");
		out.print("</tr>");
		
		
	  
		for(Car i : li){	
			out.print("<tr>");
			out.print("<td>"+i.getcId()+"<td>");
			out.print("<td>"+i.getcBrand()+"<td>");
			out.print("<td>"+i.getcModal()+"<td>");
			out.print("<td>"+i.getcPrice()+"<td>");
			
			out.print("</tr>");
		}
		out.println("</table>");
	} catch (SQLException e) {
		System.out.println(e);
	}
%>



</body>
</html>