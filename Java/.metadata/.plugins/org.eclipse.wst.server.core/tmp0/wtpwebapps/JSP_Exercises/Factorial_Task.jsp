<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int res=1,i;
int fact(int n){
	for(i=n;i>0;i--){
		res=res*i;
	}
	return res;
}

%>

<%="Factorial of 5 is: "+fact(5) %>
</body>
</html>