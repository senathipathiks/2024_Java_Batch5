<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function edit(){
	id = document.getElementById("id");
	enable(this);
}
</script>
</head>
<body>
<center>
<form action = "alldetails" method="post">
<h1>Student Details</h1>
<table cellpadding="10px" border="1" >
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</th>
<th colspan="2">Actions</th>
</tr>
<tr>
<c:forEach items="${Studlist }" var="list" >
<td><input type="text" id="id" value=${list.getSid() } disbaled ></td>
<td><input type="text" id="name" disbaled value=${list.getSname() }></td>
<td><input type="text" id="city" disbaled  value=${list.getScity() }></td>
<td><input type="button" name="edit" onclick="return /edit();" value="Edit"></td>
<td><input type="button" name="save" value="Save"></td>
 </tr>
</c:forEach>
</table>
</form>
 
 
</center>
</body>
</html>