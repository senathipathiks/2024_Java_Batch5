<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MainServletControl" method="post">
<center>
     <h1>Delete Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="empid"></td>
        </tr>
     </table><br>
     <input type="submit" value="Delete" name="Button">
   </form>
</center>
</body>
</html>