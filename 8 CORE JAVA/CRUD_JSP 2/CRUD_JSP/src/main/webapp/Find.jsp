<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="${pageContext.request.contextPath}style.css" rel="stylesheet" type="text/css" >
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MainServlet" method="post">
<center>
     <h1>Find Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Doner Id :  </td>
            <td><input type="number" name="donorid"></td>
        </tr>
     </table><br>
     <input type="submit" value="Find" name="Button">
   </form>
</center>
</body>
</html>