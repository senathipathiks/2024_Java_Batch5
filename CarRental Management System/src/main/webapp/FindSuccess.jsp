<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ include file="Find.jsp" %>
    <%@ page import="com.car.bean.Car, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
		ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("resultList");
	
		out.println("<center><h1><font color='Green'>Record Found!</font></h1></center>");
		
		
		out.print("<center><table border=2>");
		out.print("<tr>");
		out.print("<th>Car ID<th>");
		out.print("<th>BrandName<th>");
		out.print("<th>Modal<th>");
		out.print("<th>Price<th>");
		out.print("</tr>");
		
		
	  
		for(Car i : list){	
			out.print("<tr>");
			out.print("<td>"+i.getcId()+"<td>");
			out.print("<td>"+i.getcBrand()+"<td>");
			out.print("<td>"+i.getcModal()+"<td>");
			out.print("<td>"+i.getcPrice()+"<td>");
			
			out.print("</tr>");
		}
		
		
		out.println("</table>");
		
	%>
	
		
</body>
</html>