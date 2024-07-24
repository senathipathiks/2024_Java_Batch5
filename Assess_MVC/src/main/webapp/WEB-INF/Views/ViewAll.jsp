<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <style>
 
    table {
        border-collapse: collapse;
        width: 100%;
        max-width: 600px;
        margin: 0 auto;
         background-color: rgb(248, 26, 92);
    }
 
    th, td {
        border: 1px solid white;
        padding: 10px;
        text-align: left;
        color: white; /* Set font color to white */
         background-color: rgb(248, 26, 92);
    }
 
    th {
        
         background-color: rgb(248, 26, 92);
    }
    </style>-->
    
    <style>
			body{
                background-color: aliceblue;
            }
           
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color:lightpink;
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 20px;
                font-weight: bold;
                font-size: 15px;
                border-width:8px;
                
                border-color: white;
                margin-top:10px;
                margin-left:10px;
                
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:2px;
                border-color: white;
            }
</style>
</head>
<body>
<center>
<form >
<h1> Student details</h1>
 
<table border="2">
 
<tr>
<th><h2>Student ID</h2></th>
<th><h2>Student Name</h2> </th>
<th><h2>Student city</h2></th>
</tr>
<tr>
<c:forEach items="${Studlist}" var="stud" >
<td><h2>${stud.getSid() }</h2></td>
<td><h2>${stud.getSname() }</h2></td>
<td><h2>${stud.getScity() }</h2></td>
</tr>     
      </c:forEach>
 
 
</table>
 
 
</center>
</form>
</body>