<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
h1{
color:rgb(255, 4, 4);
}
body{
background: rgb(231,252,255);
background: linear-gradient(90deg, rgba(231,252,255,1) 35%, rgba(245,240,255,1) 100%);
}
select{
width:250px;
height:30px;
}
input[type="submit"]{
background-color: rgb(69, 117, 249);
width:100px;
height :30px;
border: none;
color: white;
font-weight: bold;
font-size: 15px;
}
table{
border-color:rgb(251, 103, 12);
}
td{
color:rgb(251, 103, 12);
font-weight:bold;
}

</style>
<body>
<center>
<form>
<h1>Student Details</h1>
<table  cellpadding="10px" border="7">
    <tr>
      <th>Student ID </th>
	  <th>Student Name </th>
	  <th>Student City</th>
	</tr>
	
	<c:forEach items="${StudList}" var="stud" >
	<tr>
	   <td>${stud.getId() }</td>
	   <td>${stud.getSname() }</td>
	   <td>${stud.getScity() }</td>
	</tr>      
	</c:forEach>	
</table>
</form>
</center>

</body>
</html>