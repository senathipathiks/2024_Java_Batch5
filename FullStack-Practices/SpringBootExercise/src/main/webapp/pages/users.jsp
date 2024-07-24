<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Data Table</title>
    <style>
        .editRow {
            display: none;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    <table id="myTable">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td class="id">${user.id}</td>
                <td class="name">${user.name}</td>
                <td class="city">${user.city}</td>
                <td>
                    <button class="editBtn">Edit</button>
                    <button class="saveBtn" style="display: none;">Save</button>
                    <form action="${pageContext.request.contextPath}/users/${user.id}" method="post">
                        <input type="submit" value="Delete"/>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>

    <script>
        $(document).ready(function(){
            $(".editBtn").click(function(){
                var tr = $(this).closest('tr');
                tr.find('.editBtn').hide();
                tr.find('.saveBtn').show();
                tr.find('.name, .city').attr('contenteditable', 'true');
            });

            $(".saveBtn").click(function(){
                var tr = $(this).closest('tr');
                tr.find('.editBtn').show();
                tr.find('.saveBtn').hide();
                tr.find('.name, .city').attr('contenteditable', 'false');

                var id = tr.find('.id').text();
                var name = tr.find('.name').text();
                var city = tr.find('.city').text();

                $.ajax({
                    url: '${pageContext.request.contextPath}/users/update',
                    type: 'post',
                    data: {id: id, name: name, city: city},
                    success: function() {
                        alert('User updated successfully');
                    },
                    error: function() {
                        alert('Error updating user');
                    }
                });
            });
        });
    </script>
</body>
</html>
