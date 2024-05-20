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
String name=request.getParameter("b");
int num1=Integer.parseInt(request.getParameter("n1"));
int num2=Integer.parseInt(request.getParameter("n2"));
if(name.equals("Add"))
{
	RequestDispatcher rd=request.getRequestDispatcher("CalculatorApp.jsp");
	rd.include(request, response);
	//out.println("<h1><font color=red>INVALID USERNAME/PASSWORD</font></h1>");
	out.print("Addtion:"+(num1+num2));
	
}
else if(name.equals("Sub"))
{
	RequestDispatcher rd=request.getRequestDispatcher("CalculatorApp.jsp");
	rd.include(request, response);
	out.print("Subraction:"+(num1-num2));
}
else if(name.equals("Mul"))
{
	RequestDispatcher rd=request.getRequestDispatcher("CalculatorApp.jsp");
	rd.include(request, response);
	out.print("Multiplication:"+(num1*num2));
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("CalculatorApp.jsp");
	rd.include(request, response);
	out.print("Division:"+(num1/num2));
}
%>
</body>
</html>