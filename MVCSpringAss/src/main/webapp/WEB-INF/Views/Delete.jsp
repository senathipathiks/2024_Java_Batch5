<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
			body{
			background-image: url("https://th.bing.com/th/id/OIP.0CxHyuHGnwlkm_199tl1XAHaFY?rs=1&pid=ImgDetMain");
			
			
			background-repeat: no-repeat;
  			background-size: 1200px 600px;
  			color: aliceblue;
  			
  			
        	}
</style>
</head>
<body>
<center>
<form action="Deletion" method="post" modelAttribute="bean">
<table>
<h1>Delete Alumni by ID</h1>
<tr><h2>ID :
	   <select name="aid">
	   <option selected>Select ID </option>

	   <c:forEach items="${idList}" var="id" >

      <option value="${id}">${id}</option>

      </c:forEach></tr>
      
      </select><br>

	  <br><input type="Submit" value="Delete" name="button">
</h2>
</form>
</center>
</table>
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=yellow>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>