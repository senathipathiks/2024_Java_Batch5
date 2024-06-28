<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="calculate"  method="post">
Enter the number 1: <input type="number" name="num1" > <br/> <br/>
Enter the number 2: <input type="number" name="num2" > <br/> <br/>
<input type="submit" value="ADD" name="enter"/><br/> <br/>
<input type="submit" value="SUB" name="enter"/><br/> <br/>
<input type="submit" value="MUL" name="enter"/><br/> <br/>
<input type="submit" value="DIV" name="enter"/><br/> <br/>
</form>

	<%
	int action = (int)request.getAttribute("Action");
	if (action != '0' ) {
		out.print(action);

	}
	%>

</body>
</html>