<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
   <%@ include file="View.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Showing Saved Records </h1>
<table border="1">
        <tr>
            <th>EmpID</th>
            <th>EmpName</th>
            <th>EmpDesig</th>
            <th>EmpDept</th>
        </tr>
       
        <c:forEach var="employee" items="${list}">
            <tr>
                <td>${employee.empid}</td>
                <td>${employee.empname}</td>
                <td>${employee.empdesig}</td>
                <td>${employee.empdept}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>