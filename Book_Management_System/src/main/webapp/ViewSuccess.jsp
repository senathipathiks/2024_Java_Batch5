<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.bms.bean.books" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>


*{

background: rgb(34,193,195);
background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(253,187,45,1) 100%);
background-attachment: fixed;
background-repeat: no-repeat;
}

}
button {
  width: 35px;
  height: 35px;
background: rgb(34,193,195);
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color: red;}
  25%  {background-color: yellow;}
  50%  {background-color: blue;}
  100% {background-color: green;}
}
</style>
</head>
<body>
<table border="1">
<tr>
<th>BookID</th>
<th>BookName</th>
<th>BookAuthor</th>
<th>BookDateOfBuy</th>
</tr>
<e:forEach var="books" items="${list}">
<tr>
<td>${books.bookid}</td>
<td>${books.bookname}</td>
<td>${books.bookauthor}</td>
<td>${books.bookdateofbuy}</td>

</tr>
</e:forEach>
</table>
</body>
</html>