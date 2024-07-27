<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1,p{
color:white
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
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
<form action="Insertion" method="post">
<h1 align="center" class="display-1">Insertion Form</h1>
<hr>
<table align="center">
	<tr>
		<td>
			<p class="display-3">Student ID:</p>
		</td>
		<td>
			<input type="text" id="sid" name="sid" required>
		</td>
	</tr>
	<tr>
		<td>
			<p class="display-3">Student Name:</p>
		</td>
		<td>
			<input type="text" id="sname" name="sname" required>
		</td>
	</tr>
	<br>
	<tr>
		<td>
			<p class="display-3">Student City:</p>
		</td>
		<td>
			<input type="text" id="scity" name="scity" required>
		</td>
	</tr>	
</table>
<br>
<div class="text-center">
	<input type="submit" class="btn btn-success" name="button" value="Insert">
</div>

</form>
<%
					String result = (String) request.getAttribute("Action");
					
					if(result!=null){
						
					if(result.equals("Success")){
						 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
					}
					else{
						 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
					}
					
					}
					
					
%>
</body>
</html>