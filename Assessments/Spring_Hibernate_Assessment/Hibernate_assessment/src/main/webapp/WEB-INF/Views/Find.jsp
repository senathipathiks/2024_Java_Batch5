<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
h1,td,p{
color:white
}
body{
background-image: linear-gradient(#200122,#6f0000);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
</head>
<body>
<form action="FetchFind" method="post" align="center" modelAttribute="bean">
<h1 class="text-center display-1">Find Tender Details by ID</h1>
<p class="display-3 text-center">Choose ID:</p>
	   <select name="tid">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="tid" >
      <option value="${tid}">${tid}</option>
      </c:forEach>
      </select>
	  <br>
	  <br><input class="btn btn-info" type="Submit" value="Find" name="button">
</form>


<form align="center" class="container" action="Finding" method="post" modelAttribute="bean">
<h1>Tender Details</h1>
<table border="1" class="table table-hover">
<tr>
	<th scope="col">Tender ID</th>
	<th scope="col">Tender Name</th>
	<th scope="col">Tender City</th>
	<th scope="col">Tender Budget</th>
	<th scope="col">Tender Description</th>
	<th scope="col">Tender Owner</th>
</tr>

		<tr>
			<td>${tendfind.getTid() }</td>
			<td>${tendfind.getTname() }</td>
			<td>${tendfind.getTcity() }</td>
			<td>${tendfind.getTbudget() }</td>
			<td>${tendfind.getTdesc() }</td>
			<td>${tendfind.getTowner() }</td>
		</tr>
</table>
</form>
</body>
</html>