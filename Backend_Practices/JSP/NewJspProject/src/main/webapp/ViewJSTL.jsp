<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center> 

<h1> Showing Saved Records </h1>
<table border="1">
        <tr>
            <th>StuId</th>
            <th>StuName</th>
            <th>StuCity</th>
        </tr>
       
        <c:forEach var="stu" items="${list}">
            <tr>
                <td>${stu.stuId}</td>
                <td>${.}</td>
                <td>${employee.edesig}</td>
            </tr>
        </c:forEach>
    </table>

</center>

</body>
</html>