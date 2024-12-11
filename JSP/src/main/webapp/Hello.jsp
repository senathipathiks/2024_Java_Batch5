<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Practices 1</title>
</head>
<body>

<%-- Hi friends this is Nandhakumaran --%>

<%! String name = "Nandhakumaran";
int square(int x){
	return x*x;
}

%>

<%= "The Square of 2 is:"+square(2) %>
<br>

<%  out.println("Hello World");
out.println("Name: "+name);
%>

</body>
</html>