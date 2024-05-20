<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.print("<h1> hello</h1>");
%>

<%! String fname="vidhu";

int square(int x){
return x*x;
}
%>

<%= "square value of 2 is : "+square(2) %>

<%

out.println(" name is "+fname);

%>

</body>

</html>


































