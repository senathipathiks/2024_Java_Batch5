<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: linear-gradient(to right top, #d16ba5, #c777b9, #ba83ca, #aa8fd8,
		#9a9ae1, #8aa7ec, #79b3f4, #69bff8, #52cffe, #41dfff, #46eefa, #5ffbf1
		);
	background-repeat: no-repeat;
	height: 750px;
	font-size: x-large;
}

button, .but {
	background: #fbca1f;
	font-family: inherit;
	padding: 0.6em 1.3em;
	margin: 20px;
	font-weight: 900;
	font-size: 18px;
	border: 3px solid black;
	border-radius: 0.4em;
	box-shadow: 0.1em 0.1em;
	cursor: pointer;
}

button, .but:hover {
	transform: translate(-0.05em, -0.05em);
	box-shadow: 0.15em 0.15em;
}

button, .but:active {
	transform: translate(0.05em, 0.05em);
	box-shadow: 0.05em 0.05em;
}
</style>
</head>
<body>
	<form action="Insertion" method="post">
		<center>
			<h1>Insert Student Details</h1>

			Enter Student Name: <input type="text" name="sname"><br>
			<br> Enter Student City: <input type="text" name="scity"><br>
			<br> <input type="submit" name="ins" class="but" value="Insert"><br>
		</center>
	</form>
	<%
	String result = (String) request.getAttribute("Action");

	if (result != null) {

		if (result.equals("Success")) {
			out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
		} else {
			out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
		}

	}
	%>
</body>
</html>