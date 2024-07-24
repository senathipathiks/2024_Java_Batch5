<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<center>
<h1>Deletion Page</h1>
<br>
<form action="Controller" method="get">
 <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="eid" required></td>
        </tr>
 </table> <br> 
 <input type="submit" name="button" value="Delete">
 </form>
 </center>
</body>
</html>