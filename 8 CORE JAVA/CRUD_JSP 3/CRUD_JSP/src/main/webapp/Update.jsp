<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="MainServlet" method="post">
<center>
     <h1>Updation Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="empid"></td>
        </tr>
        <tr>
            <td>Employee Name : </td>
            <td><input type="text" name="empname"></td>
        </tr>
        <tr>
            <td>Designation :</td>
            <td><input type="text" name="empdesig"> </td>
        </tr>
        <tr>
            <td>Department :</td>
            <td><input type="text" name="empdepart"></td>
        </tr>
     </table><br>
     <input type="submit" value="Update" name="Button">
   </form>
</center>
</body>
</html>