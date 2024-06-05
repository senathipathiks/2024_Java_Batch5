<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.lmsdb.bean.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <style>
        /* Set the background color of the entire table */
        table {
            background-color: white;
        }

        /* Set the font color for all table cells (both headers and regular cells) */
        th, td {
            color: green;
        }
    </style>
</head>
<body>
    <center>
        <h1 style="color: white">!!! Find successful !!!</h1>
    </center>
    <% LinkedList<Employee> list = (LinkedList<Employee>) request.getAttribute("ls"); %>
    <center>
        <table border="1" id="table">
            <tr>
                <th>EmpID</th>
                <th>EmpName</th>
                <th>Designation</th>
                <th>Department</th>
            </tr>
            <% for (Employee i : list) { %>
                <tr>
                    <td><%= i.getEmpid() %></td>
                    <td><%= i.getEpmname() %></td>
                    <td><%= i.getEmpdesig() %></td>
                    <td><%= i.getEmpdept() %></td>
                </tr>
            <% } %>
        </table>
    </center>
</body>
</html>

<%@ include file="find.jsp"%>