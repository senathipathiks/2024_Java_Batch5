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
String name = request.getParameter("uname");
String phno = request.getParameter("pno");
String location = request.getParameter("loc");
String age = request.getParameter("age");
String email = request.getParameter("email");
String validateemail = "@gmail.com";
int flag = 0;
if(name == ""){
	out.println("name should be entered");
} else if(phno.length() <10){
	out.println("Phone should be 10 digits");
} else if(location == ""){
	out.println("location should be entered");
} else if(age == ""){
	out.println("age should be entered");
} else {
	if(!email.contains(validateemail)){
		out.println("email should be correct format");
	}
	else{
		out.println("welcome to our application");
	}
	
	
	
}


%>
</body>
</html>