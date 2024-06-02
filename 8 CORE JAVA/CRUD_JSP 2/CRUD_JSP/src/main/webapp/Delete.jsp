<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
 background-image: url("12.jpg");
 background-color: #cccccc;
	height: 100%;

  /* Center and scale the image nicely */
  
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>
<form action="MainServlet" method="post">
<center>
     <h1>Delete Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Donor Id :  </td>
            <td><input type="number" name="donorid"></td>
        </tr>
     </table><br>
     <input type="submit" value="Delete" name="Button">
   </form>
</center>
</body>
</html>