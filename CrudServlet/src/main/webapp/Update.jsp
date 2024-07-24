<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Updation Page</h1></center> <br>
<center>
<form action="Controller" method="get">
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Employee Name : </td>
            <td><input type="text" name="ename"></td>
        </tr>
        <tr>
            <td>Designation :</td>
            <td><input type="text" name="desg"> </td>
        </tr>
        <tr>
            <td>Department :</td>
            <td><input type="text" name="dept"></td>
        </tr>
     </table><br>
     <input type="submit" name="button" value="Update">
   </form>
</center>
</body>
</html>