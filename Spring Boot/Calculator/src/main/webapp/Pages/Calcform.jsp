<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="docal" method="post" align="center">
<h1>Calculator</h1> <br><br>
Enter number 1: <input type="text" name="first"> <br><br>
Enter number 2: <input type="text" name="second"> <br> <br>
<input type="submit" value="Add" name="but"></input>
<input type="submit" value="Sub" name="but"></input>
<input type="submit" value="Mul" name="but"></input>
<input type="submit" value="Div" name="but"></input>
</form>

<% 


String action = (String) request.getAttribute("Action");
String result = (String) request.getAttribute("Result");


if("Success".equals(action)){
	
out.println("<center>");
out.println("<h1>Result is: <h1>"+result);
out.println("</center>");

}
else if("Fail".equals(action)){
out.println("<center>");
out.println("<h1>Can't do the operation!!!<h1>");
out.println("</center>");
}
%>
</body>
</html>