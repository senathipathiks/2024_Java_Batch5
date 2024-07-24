<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<style>
th{
background-color: rgb(69, 117, 249);
color:white;
font-weight:bold;
font-size: large;
}
td{
 background-color: rgb(99, 248, 91);
}
a{
text-decoration: none;
color:white;
font-weight:bold;
font-size: large;
}
</style>
</head>
<body>
    <table border="5" cellpadding="10px" cellspacing="20px">
        <tr>
            <th>Dashboard</th>
        </tr>
        <tr>
            <td align="center"><a href="homeframe3.jsp" target="frame3">Home</a></td> 
         </tr>
        <tr>
            <td align="center"><a href="Insert.jsp" target="frame3">Insert</a></td> 
         </tr>
        <tr>
           <td align="center"><a href="Delete.jsp" target="frame3">Delete</a></td> 
        </tr>
        <tr>
            <td align="center"><a href="Update.jsp" target="frame3">Update</a></td>
        </tr>
        <tr>
            <td align="center"><a href="ViewAll.jsp" target="frame3">ViewAll</a></td>
        </tr>
        <tr>
            <td align="center"><a href="Find.jsp" target="frame3">Find</a></td>
        </tr>
    </table>
</body>
</html>