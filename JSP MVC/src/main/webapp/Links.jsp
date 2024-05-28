<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-color:pink;
}
#but{
margin-top:100px;
margin-left:50px;
}
button{
border:none;
 width:100px;
 height:30px;
 background-color:rgba(28, 180, 28, 0.605);
 border-radius:3px;
 font-weight:bold;


}
a{
text-decoration:none;
font-size:18px;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div id="but">
        <button><a href="insert.jsp" target="f3">Insert</a></button><br><br>
        <button><a href="delete.jsp" target="f3">Delete</a></button><br><br>
        <button><a href="update.jsp" target="f3">Update</a></button><br><br>
        <button><a href="find.jsp" target="f3">Find</a></button><br><br>
        <button><a href="View.jsp" target="f3">View All</a></button>
        </div>
</body>
</html>