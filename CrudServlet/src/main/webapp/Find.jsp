<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Finding Page</h1>
<br>
<form action="Controller" method="get">
 <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="eid"></td>
        </tr>
 </table> <br>
 <input type="submit" name="button" value="Find">
 </form>
 </center>
</body>
</html>