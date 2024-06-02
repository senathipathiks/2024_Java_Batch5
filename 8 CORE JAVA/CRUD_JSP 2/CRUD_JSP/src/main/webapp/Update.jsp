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
     <h1>Updation Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Donor Id :  </td>
            <td><input type="number" name="donorid"></td>
        </tr>
        <tr>
            <td>Donor Name : </td>
            <td><input type="text" name="donorname"></td>
        </tr>
        <tr>
            <td>Donor Blood Group :</td>
            <td><input type="text" name="donorbg"> </td>
        </tr>
        <tr>
            <td>Donor Phone Number :</td>
            <td><input type="text" name="donorphoneno"></td>
        </tr>
     </table><br>
     <input type="submit" value="Update" name="Button">
   </form>
</center>
</body>
</html>