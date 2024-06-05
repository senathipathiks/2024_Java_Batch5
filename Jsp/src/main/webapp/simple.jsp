<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- data member and methods -->
<%! String firstname="SUBASH";
int square(int x){
	return x*x;
}
%>
<!-- inside service method -->
<%="square value of 2 is : " +square(2) %>   
<br>
<%   
out.println("Name : "+firstname);
%>
<!-- inside service method -->
</body>
</html>