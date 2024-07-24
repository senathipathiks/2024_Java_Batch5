<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("https://images.pexels.com/photos/6985136/pexels-photo-6985136.jpeg?cs=srgb&dl=pexels-codioful-6985136.jpg&fm=jpg");

}
h1{
color:rgb(82, 122, 122);
}
form{
background-color:rgb(255, 179, 209);
padding:4rem;
margin:0px auto;
width:50%

}
select{
	width:200px;
	height:30px;
}

input[type="submit"]{
border:none;
 width:100px;
 height:30px;
 background-color:rgba(28, 180, 28, 0.605);
 border-radius:3px;
 font-weight:bold;
 color:blue;
 font-size:20px;
}
label{
font-weight:bold;
font-size:20px;
color:rgb(191, 64, 128);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form >
<h1>Student Details</h1>
<table border="1px solid black">
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</tr>
</tr>
<tr>
<c:forEach items="${Studlist}" var="stud" >
<td>${stud.getSname()}</td>
<td>${stud.getScity()}</td>
</tr>     
</c:forEach>
</table>
</form>


</center>
</body>
</html>