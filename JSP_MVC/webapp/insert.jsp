<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Insertion</h1></center>
<form action="Controller1" method="post">
<center>
<table border="2" >
<tr>
<td>Enter the student ID:</td>
<td><input type="number" name="studId"></td>
</tr>
<tr>
<td>Enter the Student Name:</td>
<td><input type="text" name="studName"></td>
</tr>
<tr>
<td>Enter the Student Age:</td>
<td><input type="number" name="studAge"></td>
</tr>
<tr>
<td>Enter the Student City:</td>
<td><input type="text" name="studCity"></td>
</tr>
<tr colspan=2 >
<th colspan="2"><input type="submit" value="Insert" name="button"></th>
</tr>
</table>
</center>

</form>

</body>
</html>