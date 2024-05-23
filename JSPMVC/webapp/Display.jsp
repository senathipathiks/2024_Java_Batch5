<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
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
                <td>${employee.empId}</td>
                <td>${employee.empName}</td>
                <td>${employee.empDesg}</td>
                <td>${employee.empDept}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>