<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
            
            body{
                background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
                
            }
            table, input{
            background-color : rgba(208, 238, 242);
            }
           
            .button:hover{
            background-color:rgba(100, 164, 189);
            }
            table{
            border-radius : 10px;
            }
            table{
            text-decoration: none;
  position: relative;
  border: none;
  font-size: 14px;
  font-family: inherit;
  cursor: pointer;
  color: #fff;
  width: 44em;
  height: 3em;
  line-height: 2em;
  text-align: center;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 470%;
  border-radius: 0px;
  z-index: 1;
            }

        </style>
</head>	
<body>
<center>
<form>
<h1>Student Result Details</h1>
<table border = "1">
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student Roll No</th>
<th>Student Marks</th>
</tr>
<c:forEach items="${StudList}" var="stud">
<tr>
<td>${stud.getId() }</td>
<td>${stud.getName() }</td>
<td>${stud.getRollno() }</td>
<td>${stud.getMarks() }</td>
</tr>
</c:forEach>
</table>

</form>
</center>
</body>
</html>