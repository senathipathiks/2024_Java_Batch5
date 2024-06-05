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
int flag =0;
int num = Integer.parseInt(request.getParameter("num"));
int result = 1;

for(int i=1;i<=num;i++){
	if(flag==1){
		break;
	}
	result = result*i;
	
}
int dum = result;
flag =1;
%>
<jsp:include page="factorial.jsp"/>
<%
out.println("Factorial of "+num+" is : "+dum);
%>
</body>
</html>