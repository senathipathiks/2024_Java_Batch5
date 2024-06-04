<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
            
            body{
                background-color:rgba(15,77,134,255);
                color: aliceblue;
            }
            button{
            background-color:aliceblue;
            border-color:silver;
            border-width: 10px;
            border-radius:20px ;
            color: rgba(224,45,84,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 20px;
            font-weight:inherit;
            height:60px;
            }

        </style>
</head>
<body>
 
        <button><a href="insert.jsp" target="f3">Insert</a></button><br><br>
        <button><a href="delete.jsp" target="f3">Delete</a></button><br><br>
        <button><a href="update.jsp" target="f3">Update</a></button><br><br>
        <button><a href="find.jsp" target="f3">Find</a></button><br><br>
        <button><a href="View.jsp" target="f3">View All</a></button>
</body>
</html>